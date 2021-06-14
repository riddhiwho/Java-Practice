import java.sql.*;

import java.io.*;

class Update{
    public static void main(String args[]){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/clothing";
            String user="riddhi";
            String pass="riddhi";
            Connection con=DriverManager.getConnection(url, user, pass);

            String q = "INSERT INTO CONSUMER(fullname, password, phone, location) VALUES (?, ?, ?, ?)";

        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            //System.out.println("Enter id");
            //String c_id = br.readLine();

            System.out.println("Enter full name: ");
            String fullname = br.readLine();

            System.out.println("Enter password: ");
            String password = br.readLine();

            System.out.println("Enter phone: ");
            String phone = br.readLine();

            System.out.println("Enter location: ");
            String location = br.readLine();

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1, fullname);
            pstmt.setString(2, password);
            pstmt.setString(3, phone);
            pstmt.setString(4, location);

            pstmt.executeUpdate();
            System.out.println("Done");

            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}