import java.sql.*;


class InsertJDBC{
    public static void main(String args[]){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
	        String username="riddhi";
	        String password="riddhi";
	
	        Connection con=DriverManager.getConnection(url,username,password);

            // create a query

            String q = "CREATE TABLE REGISTRATION " +
                   " (first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " city VARCHAR(255), " + 
                   " PRIMARY KEY ( first ))";

            // create a statement

            Statement stmt = con.createStatement();

            stmt.executeUpdate(q);

            System.out.println("table created in database");

            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}