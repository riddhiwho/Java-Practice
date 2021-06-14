import java.util.*;

public class ll1{
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ravi");
        ll.add("Suman");
        ll.add("Vinay");
        ll.add("Priya");

        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}