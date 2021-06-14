import java.util.*;

public class otheriter{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Suman");
        list.add("Mansi");

        System.out.println("Traversing through list iterator");

        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }

        System.out.println();

        System.out.println("Traversing through for loop");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println();

        System.out.println("Traversing through forEach() method");

        list.forEach(a->{ //lambda exp used
            System.out.println(a);
        });

        System.out.println();

        System.out.println("Traversing through forEachRemaining() method");
        
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a->{
            System.out.println(a);
        });
    }
}