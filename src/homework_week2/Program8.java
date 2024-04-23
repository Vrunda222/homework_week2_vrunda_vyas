package homework_week2;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Program8 {
    public static void main(String[] args) {
    Program8 obj = new Program8();
    obj.meth1();
    }
    public void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of base: ");
        int b = sc.nextInt();

        System.out.println("Enter value of height: ");
        int h = sc.nextInt();

        int area = (b*h)/2;
        System.out.println("Area of triangle is: " + area);
    }
}
