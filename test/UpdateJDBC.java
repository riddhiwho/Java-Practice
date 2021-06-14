import java.io.*;
import java.sql.*;

class UpdateJDBC{
    public static void main(String args[]){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
	        String username="riddhi";
	        String password="riddhi";
	
	        Connection con=DriverManager.getConnection(url,username,password);

            String q = "update REGISTRATION set last=? where first=?";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter last name: ");

            String last = br.readLine();

            System.out.println("Enter first name: ");
            String first = br.readLine();

            PreparedStatement pstmt = con.prepareStatement(q);

           pstmt.setString(1, last);
           pstmt.setString(2, first);
           
           pstmt.executeUpdate();
           System.out.println("Done");

           con.close();

        }catch(Exception e){

        }
    }
}