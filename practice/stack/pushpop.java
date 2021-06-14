import java.util.*;

public class pushpop{
    public static void main(String args[]){
        Stack<Integer> stk = new Stack<Integer>();
        System.out.println("Stack: " + stk);
        pushelmnt(stk, 20);
        pushelmnt(stk, 30);
        pushelmnt(stk, 40);
        pushelmnt(stk, 50);
        pushelmnt(stk, 60);
        pushelmnt(stk, 70);

        popelmnt(stk);
        popelmnt(stk);

        try{
            popelmnt(stk);
        }catch(EmptyStackException e){
            System.out.println("Empty stack");
        }
    }
    static void pushelmnt(Stack stk, int x){
        stk.push(Integer.valueOf(x));
        System.out.println("push->" + x);
        System.out.println("Stack: " + stk);
    }
    static void popelmnt(Stack stk){  
        System.out.print("pop -> ");  
        //invoking pop() method   
        Integer x = (Integer) stk.pop();  
        System.out.println(x);  
        //prints modified stack  
        System.out.println("stack: " + stk);  
    }     
}