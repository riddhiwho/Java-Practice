import java.util.*;
public class example{
    public static void main(String args[]){
        Vector<String> vec = new Vector<String>();
        vec.add("London");
        vec.add("LA");
        vec.add("Canada");

        vec.addElement("France");
        vec.addElement("Africa");
        vec.addElement("Spain");

        System.out.println("Elements: " + vec);
    }
}