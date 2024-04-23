package homework_week2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case
 */
public class Program9 {
    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any sentence in uppercase: ");
        String up = sc.nextLine();

        String lc = up.toLowerCase();
        System.out.println("Converted sentence to lowercase: " + lc);
    }
}
