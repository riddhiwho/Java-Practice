import java.io.*;
public class Emp{
    public String name;
    private double sal;

    public Emp(String name){
        this.name = name;
    }

    public void setSal(double sal){
        this.sal = sal;
    }

    public void printEmp(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
    }

    public static void main(String args[]){
        Emp e1= new Emp("XYZ");
        e1.setSal(1000);
        e1.printEmp();
    }
}

