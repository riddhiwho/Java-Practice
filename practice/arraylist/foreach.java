import java.util.*;

public class foreach{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Raspberry");
        list.add("Plum");
        list.add("Grapes");

        for(String fruit:list)
            System.out.println(fruit);
    }
}