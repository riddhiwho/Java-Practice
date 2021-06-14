import java.util.regex.*;

public class example{
    public static void main(String args[]){
        Pattern pattern = Pattern.compile("riddhi", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hi Riddhi");
        boolean matchfound = matcher.find();
        if(matchfound){
            System.out.println("Match found");
        } else{
            System.out.println("Match not found");
        }
    }
}