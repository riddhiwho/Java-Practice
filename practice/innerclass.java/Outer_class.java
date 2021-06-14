abstract class AnonymousInner{
    public abstract void myMethod();
}

public class Outer_class{
    public static void main(String args[]){
        AnonymousInner inner = new AnonymousInner(){
            public void myMethod(){
                System.out.println("An example of anonymous inner class");
            }
        };
        inner.myMethod();
    }
}