import java.sql.*;

public class StudentDao{

    public static boolean insertStudentToDB(Student st){

        boolean f = false;
        try{

            //jdbc code..
            Connection con = CP.createC();

            String q = "insert into students(sname, sphone, scity) values(?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            //set the values of parameters
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());

            //execute..
            pstmt.executeUpdate();
            f=true;


        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userId){
        boolean f = false;
        try{

            //jdbc code..
            Connection con = CP.createC();

            String q = "Delete from students where sid=?";
            PreparedStatement pstmt = con.prepareStatement(q);

            //set the values of parameters
            pstmt.setInt(1, userId);

            //execute..
            pstmt.executeUpdate();
            f=true;


        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static void showAllStudent(){
        boolean f = false;
        try{

            //jdbc code..
            Connection con = CP.createC();

            String q = "Select * from students";
            
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);

            while(set.next()){
                int id=set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString("scity");

                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("Phone: "+phone);
                System.out.println("City: "+city);
                System.out.println();
                System.out.println();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}