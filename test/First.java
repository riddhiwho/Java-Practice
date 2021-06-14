import java.sql.*;

class First{
    public static void main(String args[]){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/clothing";
            String user="riddhi";
            String pass="riddhi";

            Connection con=DriverManager.getConnection(url, user, pass);

            if(con.isClosed()){
                System.out.println("Connection closed");
            }else{
                System.out.println("Conenction created");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}