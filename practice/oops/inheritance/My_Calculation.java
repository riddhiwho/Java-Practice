class Calculation{
    int z;

    public void addition(int x, int y){
        z = x+y;
        System.out.println("Sum: " + z);
    }

    public void subtraction(int x, int y){
        z = x-y;
        System.out.println("Sum: " + Math.abs(z));
    }
}

public class My_Calculation extends Calculation{
    public void multiplication(int x, int y){
        z = x*y;
        System.out.println("Product: " + z);
    }

    public static void main(String args[]){
        int a = 10; int b = 30;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
    }
}