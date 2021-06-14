class Super_class{
    int num = 20;

    public void display(){
        System.out.println("Display method of super class");
    }
}

public class Sub_class extends Super_class{
    int num = 10;
    
    public void display(){
        System.out.println("Display method of sub class");
    }

    public void my_method(){
        Sub_class sub = new Sub_class();
        sub.display();
        super.display();

        System.out.println("Num of super class: " + super.num);
        System.out.println("Num of sub class: " + sub.num);
    }

    public static void main(String args[]){
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}