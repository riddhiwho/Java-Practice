import java.sql.*;

public class AddColumnJDBC{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
	        String username="riddhi";
	        String password="riddhi";
	
	        Connection con=DriverManager.getConnection(url,username,password);

            System.out.println("Connection established");

            Statement stmt = con.createStatement();

            String q = "ALTER TABLE REGISTRATION ADD CITY VARCHAR(225)";
            stmt.executeUpdate(q);
            System.out.println("Column added..");

            PreparedStatement pstmt = con.prepareStatement("UPDATE REGISTRATION SET city =? where first = ?");

            pstmt.setString(1, "New Delhi");
            pstmt.setString(2, "Riddhi");
            pstmt.executeUpdate();

            System.out.println("Values inserted..");



        }catch(Exception e){
            e.printStackTrace();
        }
    }
}