import java.util.*;
public class addll{
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();
        System.out.println("Initial set of elements: "+ ll);
        ll.add("lmao");
        ll.add("rofl");
        ll.add("lol");
        System.out.println("After invoking add(E e) method" + ll);

        //adding an element at specific position
        ll.add(1,"lmfao");
        System.out.println("After invoking add(int index, E element) method: " + ll);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("fomo");
        ll2.add("ttyl");
        
        //adding second list elements to first list
        ll.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E>c) method:" + ll);
        LinkedList<String> ll3 = new LinkedList<>();
        ll3.add("wya");
        ll3.add("tbh");

        //adding second list elements to first list at specific position
        ll.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, COllection<? extends E> c) method: " + ll);

        //adding an element at the first position
        ll.addFirst("iykyk");
        System.out.println("After invoking addFirst(E e) method: " + ll);

        //adding an element to the last position
        ll.addLast("ikr");
        System.out.println("After invoking addLast(E e) method: " + ll);
    }
}