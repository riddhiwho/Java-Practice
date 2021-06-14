class Animal{
    public void move(){
        System.out.println("Animals move");
    }
}

class Dog extends Animal{
    public void move(){
        super.move();
        System.out.println("Dogs walk and run");
    }
}

public class DogTest{
    public static void main(String args[]){
        Animal b = new Dog();
        b.move();
    }
}