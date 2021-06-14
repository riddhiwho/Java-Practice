import java.sql.*;

class Select{
    public static void main(String args[]){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/clothing";
	        String user="riddhi";
	        String pass="riddhi";
	
            String q = "SELECT fullname, phone, location FROM CONSUMER";
	        Connection con=DriverManager.getConnection(url,user,pass);
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(q);

            while(res.next()){
                System.out.println("FULLNAME: " + res.getString("fullname"));
                System.out.println("PHONE: " + res.getString("phone"));
                System.out.println("LOCATION: " + res.getString("location"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}