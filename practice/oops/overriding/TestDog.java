class Animal{
    public void move(){
        System.out.println("Animals move");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("Animals walk and run");
    }
}

public class TestDog{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog(); // Animal reference but Dog object

        a.move();
        b.move();
    }
}