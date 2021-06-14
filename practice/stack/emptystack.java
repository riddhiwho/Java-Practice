import java.util.*;

public class emptystack{
    public static void main(String args[]){
        
        //creating an instance of stack class
        Stack<Integer> stk = new Stack<>();

        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);

        //pushing ele into stack
        stk.push(10);
        stk.push(120);
        stk.push(30);
        stk.push(80);

        //print ele 
        System.out.println("Stack elements: " + stk);

        result = stk.empty();
        System.out.println("Is the stack empty? " + result);
    }
}