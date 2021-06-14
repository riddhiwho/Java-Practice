import java.util.*;

public class sortlist{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Raspberry");
        list.add("Plum");
        list.add("Grapes");

        Collections.sort(list); //sorts the list
        for(String fruit:list)
            System.out.println(fruit);

        System.out.println("Sorting numbers..");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);

        Collections.sort(list2);

        for(Integer number:list2)
            System.out.println(number);
        
    }
}