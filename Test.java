import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter user name: ");
            String name = br.readLine();

        System.out.println("Enter user phone: ");
            String phone = br.readLine();

        System.out.println("Enter user city: ");
            String city = br.readLine();

        Stud st = new Stud(name, phone, city);
        st.display();
    }
}