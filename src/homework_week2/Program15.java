package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables
 */
public class Program15 {

    static int a, b, c;

    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st value: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd value: ");
        int b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("1st value become 2nd: " + a);
        System.out.println("2nd value become 1st: " + b);


    }
}
