import java.util.*;

public class example{
    public static void main(String args[]){
        TreeSet<String> s = new TreeSet<>();
        s.add("hey");
        s.add("wya");
        s.add("asap");
        s.add("ciao");

        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}