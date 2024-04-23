package homework_week2;

import java.util.Scanner;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Program2 {

    // declaration of static variables
    static int var1;
    static String var2;

    // main method
    public static void main(String[] args) {

        // call static method
        meth1();
    }

    //static method
    public static void meth1(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int var1 = sc.nextInt(); // taking value from user

        System.out.println("Enter name : ");
        String var2 = sc.nextLine(); // taking value from user

        System.out.println("Number = " + var1);
        System.out.println("Name = " + var2);

    }

}
