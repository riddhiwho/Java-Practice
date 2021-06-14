import java.sql.*;

class FIRSTJDBC{

	public static void main(String args[]){
		try{
			//load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection object
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="riddhi";
			String password="riddhi";
	
	Connection con=DriverManager.getConnection(url,username,password);
	
	if(con.isClosed()){
		System.out.println("Connection Closed");
	}else{
		System.out.println("connection created");
	}	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
