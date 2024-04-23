package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Program17 {

    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int var = sc.nextInt();

        // Converting that user entered decimal into binary string
        String binary = Integer.toBinaryString(var);

        System.out.println("Binary value is: " + binary);
    }
}
