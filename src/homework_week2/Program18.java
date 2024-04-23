package homework_week2;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Program18 {
    static int a = 125, b = 24;
    static float c;

    public static void main(String[] args) {
    addition();
    subtraction();
    multiplication();
    division();
    mod();
    }

    public static void addition() {
        int c = a + b;
        System.out.println("First number: " +a+ " and second number: " +b+ " and their addition is = " +c);
    }

    public static void subtraction() {
        int c = a - b;
        System.out.println("First number: " +a+ " and second number: " +b+ " and their subtraction is = " +c);
    }

    public static void multiplication() {
        int c = a * b;
        System.out.println("First number: " +a+ " and second number: " +b+ " and their multiplication is = " +c);
    }

    public static void division() {
        int c = a / b;
        System.out.println("First number: " +a+ " and second number: " +b+ " and their division is = " +c);
    }

    public static void mod() {
        int c = a % b;
        System.out.println("First number: " +a+ " and second number: " +b+ " and their mod is = " +c);
    }
}
