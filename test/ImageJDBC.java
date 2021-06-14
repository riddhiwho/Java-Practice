import java.sql.*;
import java.io.*;
import java.util.Scanner;

class ImageJDBC{
    public static void main(String args[]){
        System.out.println("Welcome to books portal, do you want to read some amazing books?");
        System.out.println("Are you already a member of this portal? \n 1. Yes \n 2.No");
        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();
        if(choice==1){
            System.out.println("please enter your username");
            String name=s.nextLine();
        }
        

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
	        String username="riddhi";
	        String password="riddhi";
	
	        Connection con=DriverManager.getConnection(url,username,password);

            String q = "INSERT INTO Images(id, pic) VALUES (?, ?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            FileInputStream fis = new FileInputStream("grogu.jpeg");

            pstmt.setInt(1, 1);
            pstmt.setBinaryStream(2, fis, fis.available());

            pstmt.executeUpdate();

            System.out.println("Image inserted");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}