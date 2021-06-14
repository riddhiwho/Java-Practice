import java.sql.*;

class Where{
    public static void main(String args[]){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/clothing";
	        String user="riddhi";
	        String pass="riddhi";
	
            //String q = "SELECT fullname, phone, location FROM CONSUMER" +  "WHERE location =" + Bangalore;
	        Connection con=DriverManager.getConnection(url,user,pass);
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("SELECT fullname FROM CONSUMER WHERE location = location");

           /* rs = stmt.executeQuery("SELECT Lname FROM Customers WHERE Snum = 2001");
            while ( rs.next() ) {
                String lastName = rs.getString("Lname");
                System.out.println(lastName);
            } */


            while(res.next()){
                String fullname = res.getString("fullname");
                System.out.println(fullname);
                //System.out.println("PHONE: " + res.getString("phone"));
                //System.out.println("LOCATION: " + res.getString("location"));
            }
            res.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}