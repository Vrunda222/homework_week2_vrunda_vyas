package homework_week2;

import java.util.Scanner;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {

    //instance variable
    int abc;
    String xyz;

    //static variables
    static int ab;
    static String xy;

    // main method
    public static void main(String[] args) {
        meth1();
        Program4 obj = new Program4();
        obj.meth2();
    }

    //static method
    public static void meth1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        String abc = sc.nextLine();

        System.out.println("Enter name1: ");
        String xyz = sc.nextLine();

        System.out.println("Enter number2: ");
        String ab = sc.nextLine();

        System.out.println("Enter name2: ");
        String xy = sc.nextLine();

        System.out.println("Method 1 Number1: " + abc);
        System.out.println("Method 1 Number2: " + ab);
        System.out.println("Method 1 Name1: " + xyz);
        System.out.println("Method 1 Name2: " + xy);
    }

    //instance method
    public void meth2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        String abc = sc.nextLine();

        System.out.println("Enter name1: ");
        String xyz = sc.nextLine();

        System.out.println("Enter number2: ");
        String ab = sc.nextLine();

        System.out.println("Enter name2: ");
        String xy = sc.nextLine();

        System.out.println("Method 2 Number1: " + abc);
        System.out.println("Method 2 Number2: " + ab);
        System.out.println("Method 2 Name1: " + xyz);
        System.out.println("Method 2 Name2: " + xy);
    }


}
