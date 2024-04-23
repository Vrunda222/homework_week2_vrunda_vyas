package homework_week2;

import java.util.Scanner;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {

    //declaring instance and static variable
    int var1; //instance
    static String var2; //static

    //main method
    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.meth1();
        meth2();
    }

    //instance method
    public void meth1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int var1 = sc.nextInt();

        System.out.println("Enter name : ");
        String var2 = sc.nextLine();

        System.out.println("Method 1 Number: " + var1);
        System.out.println("Method 1 Name: " + var2);

    }

    //static method
    public static void meth2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int var1 = sc.nextInt();

        System.out.println("Enter name : ");
        String var2 = sc.nextLine();

        System.out.println("Method 2 Number: " + var1);
        System.out.println("Method 2 Name: " + var2);
    }

}
