import java.sql.*;

import java.io.*;

class UpdateSeller{
    public static void main(String args[]){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/clothing";
            String user="riddhi";
            String pass="riddhi";
            Connection con=DriverManager.getConnection(url, user, pass);

            String q = "INSERT INTO SELLER(fullname, password, email, phone, location, shop) VALUES (?, ?, ?, ?, ?, ?)";

        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            //System.out.println("Enter id");
            //String c_id = br.readLine();

            System.out.println("Enter full name: ");
            String fullname = br.readLine();

            System.out.println("Enter password: ");
            String password = br.readLine();

            System.out.println("Enter email: ");
            String email = br.readLine();

            System.out.println("Enter phone: ");
            String phone = br.readLine();

            System.out.println("Enter location: ");
            String location = br.readLine();

            System.out.println("Enter shop name: ");
            String shop = br.readLine();

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1, fullname);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
            pstmt.setString(4, phone);
            pstmt.setString(5, location);
            pstmt.setString(6, shop);

            pstmt.executeUpdate();
            System.out.println("Done");

            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}