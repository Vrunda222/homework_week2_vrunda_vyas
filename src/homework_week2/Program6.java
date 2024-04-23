package homework_week2;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area. (Formula of Area A=PI*r*r).
 */
public class Program6 {

    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("Area = " + area);

    }
}
