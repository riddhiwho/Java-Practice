public class Puppy{
    int puppyAge;

    public Puppy(String n){
        System.out.println("Name: " + n);
    }

    public void setAge(int a){
        puppyAge = a;
    }

    public void getAge(){
        System.out.println("Pup's age is: " + puppyAge);
    }

    public static void main(String args[]){
        Puppy pup=new Puppy("Oscar");
        pup.setAge(6);
        pup.getAge();

        System.out.println("Pup's age: "+ pup.puppyAge);
    }
}