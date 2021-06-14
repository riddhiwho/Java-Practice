import java.io.*;

public class Employee{
    String name;
    int age;
    String desig;
    double sal;

    public Employee(String name){
        this.name = name;
    }

    public void empAge(int age){
        this.age = age;
    }

    public void empDesig(String desig){
        this.desig = desig;
    }

    public void empSal(double sal){
        this.sal = sal;
    }

    public void printEmp(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + desig);
        System.out.println("Salary: " + sal);
    }

    public static void main(String args[]){
        Employee e1= new Employee("James Smith");
        Employee e2 = new Employee("Peter Parker");

        e1.empAge(23);
        e1.empDesig("Software Developer");
        e1.empSal(30000);
        e1.printEmp();

        e2.empAge(33);
        e2.empDesig("Business Analyst");
        e2.empSal(250000);
        e2.printEmp();
    }
}