package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14 {
    static double width, height;
    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = sc.nextDouble();

        System.out.println("Enter height: ");
        height = sc.nextDouble();

        double area = width * height;
        double perimeter = (width + height) * 2;

        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);
    }
}
