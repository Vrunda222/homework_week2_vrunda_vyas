package homework_week2;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {

    //main method
    public static void main(String[] args) {
        addition(10,20);
        subtraction(20,10);

        Program5 obj = new Program5();
        obj.multiplication(10,20);
        obj.division(20,2);
    }

    //static method
    public static void addition(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is = " + sum);
    }

    //static method
    public static void subtraction(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is = " + sub);
    }

    //instance method
    public void multiplication(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is = " + mul);
    }

    //instance method
    public void division(int num1, int num2) {
        int div = num1 * num2;
        System.out.println("Division of " + num1 + " and " + num2 + " is = " + div);
    }
}
