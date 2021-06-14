import java.sql.*;

class Insert{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/clothing";
            String user="riddhi";
            String pass="riddhi";
            Connection con=DriverManager.getConnection(url, user, pass);

            String q="CREATE TABLE CONSUMER " +
            " (c_id INTEGER NOT NULL, " +
            " fullname VARCHAR(255), " +
            " pass VARCHAR(255), " +
            " phone VARCHAR(10), " +
            " location VARCHAR(255), " +
            " PRIMARY KEY (c_id))";

            String w="CREATE TABLE SELLER " +
            " (s_id INTEGER NOT NULL, " +
            " fullname VARCHAR(255), " +
            " pass VARCHAR(255), " +
            " email VARCHAR(255), " +
            " phone VARCHAR(10), " +
            " location VARCHAR(255), " +
            " shop VARCHAR (255), " +
            " PRIMARY KEY (s_id))";

            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            stmt.executeUpdate(w);

            System.out.println("Tables created in database");
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}