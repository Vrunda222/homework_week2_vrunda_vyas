package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */
public class Program13 {
    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total 3 values");
        System.out.println("Enter value number 1");
        int val1 = sc.nextInt();
        System.out.println("Enter value number 2");
        int val2 = sc.nextInt();
        System.out.println("Enter value number 3");
        int val3 = sc.nextInt();

        int avg = (val1 + val2 + val3) / 3;

        System.out.println("Average of three value is: " + avg);
    }
}
