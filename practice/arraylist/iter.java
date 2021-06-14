import java.util.*;

public class iter{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Avocado");

        Iterator itr =  list.iterator(); //getting the iterator
        while(itr.hasNext()){ // check if iter has elements
            System.out.println(itr.next()); 
        }
    }
}