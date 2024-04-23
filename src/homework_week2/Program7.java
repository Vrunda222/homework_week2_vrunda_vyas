package homework_week2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7 {
    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();

        double c = ((5 * (f - 32.0)) / 9.0);
        System.out.println(f + " degree Fahrenheit is equal to " + c + " °C");

    }
}
