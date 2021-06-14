import java.sql.*;

class Dropcolumn{
    public static void main(String args[]){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/clothing";
            String user="riddhi";
            String pass="riddhi";
            Connection con=DriverManager.getConnection(url, user, pass);

            Statement stmt = con.createStatement();

            /*String query = "ALTER TABLE CONSUMER Drop c_id";
            stmt.executeUpdate(query);
            System.out.println("Column Deleted......");*/

            String query = "ALTER TABLE SELLER Drop S_id";
            stmt.executeUpdate(query);
            System.out.println("Column Deleted......");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}