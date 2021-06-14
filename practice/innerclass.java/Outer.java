public class Outer{
    static class Nested_Demo{
        public void my_Method(){
            System.out.println("Nested class");
        }
    }
    public static void main(String args[]){
        Outer.Nested_Demo nested = new Outer.Nested_Demo();
        nested.my_Method();
    }
}