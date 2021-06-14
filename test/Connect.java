import java.sql.*;

public class Connect{
    static Connection con;

    public static Connection createConnect(){
        try{

            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create connection
            String user = "riddhi";
            String password = "riddhi";
            String url = "jdbc:mysql://localhost:3306/bookstore";

            con = DriverManager.getConnection(url, user, password);

        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}