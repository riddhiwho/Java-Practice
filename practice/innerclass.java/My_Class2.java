class Outer_demo {
    // private variable of the outer class
    private int num = 175;  
    
    // inner class
    public class Inner_Demo {
       public int getNum() {
          System.out.println("This is the getnum method of the inner class");
          return num;
       }
    }
 }
 
 public class My_Class2 {
 
    public static void main(String args[]) {
       // Instantiating the outer class
       Outer_demo outer = new Outer_demo();
       
       // Instantiating the inner class
       Outer_demo.Inner_Demo inner = outer.new Inner_Demo();
       System.out.println(inner.getNum());
    }
 }