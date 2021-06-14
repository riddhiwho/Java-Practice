import java.util.*;

public class getset{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Raspberry");
        list.add("Plum");
        list.add("Grapes");

        System.out.println("Returning element: " + list.get(1)); //returns 2nd element of arraylist
        list.set(1, "Dates"); //changing the element
        for(String fruit:list) //traversing list
            System.out.println(fruit);
    }
}