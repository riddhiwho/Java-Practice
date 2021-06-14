import java.sql.*;

public class SignUpDao{

    public static boolean insertStudentToDB(SignUp st){

        boolean f = false;
        try{

            //jdbc code..
            Connection con = Connect.createConnect();

            String q = "insert into signup(fullname, phone, email, password) values(?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            //set the values of parameters
            pstmt.setString(1, st.getUName());
            pstmt.setString(2, st.getUPhone());
            pstmt.setString(3, st.getUEmail());
            pstmt.setString(4, st.getUPassword());

            //execute..
            pstmt.executeUpdate();
            f=true;


        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

   

    
}