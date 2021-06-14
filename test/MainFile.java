import java.io.*;

public class MainFile{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter user name: ");
        String name = br.readLine();

        System.out.println("Enter user phone: ");
        String phone = br.readLine();

        System.out.println("Enter user email: ");
        String email = br.readLine();

        System.out.println("Enter user password: ");
        String password = br.readLine();

        SignUp st = new SignUp(name, phone, email, password);
        boolean answer = SignUpDao.insertStudentToDB(st); 
        if(answer){
            System.out.println("Successfully added");
        }else{
            System.out.println("Something went wrong..");
        }
    }
}