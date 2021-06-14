class Superclass{
    int age;

    Superclass(int age){
        this.age = age;
    }

    public void getAge(){
        System.out.println("Age from super class: " + age);
    }
}

public class Subclass extends Superclass{
    Subclass(int age){
        super(age);
    }

    public static void main(String args[]){
        Subclass s = new Subclass(21);
        s.getAge();
    }
}