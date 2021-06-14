interface Message{
    String greet();
}

public class My_class{
    public void displayMessage(Message m){
        System.out.println(m.greet() + ", This is an anonymous inner class as an argument");
    }

    public static void main(String args[]){
        My_class obj = new My_class();
        obj.displayMessage(new Message(){
            public String greet() {
                return "Hello";
            }
        });
    }
}