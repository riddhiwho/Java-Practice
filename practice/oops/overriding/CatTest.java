class Animal{
    public void move(){
        System.out.println("Animals move");
    }
}

class Cat extends Animal{
    public void display(){
        System.out.println("Cats walk and run");
    }
    public void meow(){
        System.out.println("Cats can meow");
    }
}

public class CatTest{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Cat();
        Cat c = new Cat();

        a.move();
        b.move();
        c.meow();
    }
}