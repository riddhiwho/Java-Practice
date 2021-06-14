public class Test{
    public void pupAge(){
        int age = 0;
        age +=7;
        System.out.println("Pup's age: " + age);
    }

    public static void main(String args[]){
        Test test = new Test();
        test.pupAge();
    }
}