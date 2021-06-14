public class Outerclass{
    void my_Method(){
        int num = 23;

        class MethodInner_Demo{
            public void print(){
                System.out.println("Method inner class " + num);
            }
        }
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }
    public static void main(String args[]){
        Outerclass outer = new Outerclass();
        outer.my_Method();
    }
}