//Prepared Statement: insert

import java.sql.*;

import java.io.*;

class DataJDBC{
    public static void main(String args[]){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
	        String username="riddhi";
	        String password="riddhi";
	
	        Connection con=DriverManager.getConnection(url,username,password);

            //create query

            String q = "INSERT INTO REGISTRATION(first, last) VALUES (?, ?)";
            
            //get the Prepared Statement object

            PreparedStatement pstmt= con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //System.out.println("Enter id: ");
            //int id = br.readLine();

            System.out.println("Enter first name: ");
            String first = br.readLine();

            System.out.println("Enter last name: ");
            String last = br.readLine();

            //System.out.println("Enter age: ");
            //int age = br.readLine();
            
            //set the values to query

            //pstmt.setInt(1, id);
            pstmt.setString(1, first);
            pstmt.setString(2, last);
            //pstmt.setInt(4, age);   
            
            pstmt.executeUpdate();

            System.out.println("Inserted");

            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}