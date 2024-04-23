package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19 {
    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence in lowercase: ");
        String lc = sc.nextLine();
        String uc = lc.toUpperCase();
        System.out.println("Converted sentence to uppercase: " + uc);
    }
}
