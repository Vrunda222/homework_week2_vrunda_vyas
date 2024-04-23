package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Program10 {
    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value: ");
        int val = sc.nextInt();

        System.out.println(val + " * 1 " + " = " + val * 1);
        System.out.println(val + " * 2 " + " = " + val * 2);
        System.out.println(val + " * 3 " + " = " + val * 3);
        System.out.println(val + " * 4 " + " = " + val * 4);
        System.out.println(val + " * 5 " + " = " + val * 5);
        System.out.println(val + " * 6 " + " = " + val * 6);
        System.out.println(val + " * 7 " + " = " + val * 7);
        System.out.println(val + " * 8 " + " = " + val * 8);
        System.out.println(val + " * 9 " + " = " + val * 9);
        System.out.println(val + " * 10 " + " = " + val * 10);

       // for (int i = 1; i <= 10; i++) {
           // int a = val * i;
            //System.out.println(val + " * " + i + " = " + a);
        }
    }

