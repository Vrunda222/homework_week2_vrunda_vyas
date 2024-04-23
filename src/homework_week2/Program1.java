package homework_week2;

import java.util.Scanner;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */


// main class
public class Program1 {

    // declaration of instance variable
    int var1;
    String var2;


    //main method
    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.meth1();
    }

    //instance method
    public void meth1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int var1 = sc.nextInt(); // taking value from user

        System.out.println("Enter your message: ");
        String var2 = sc.nextLine(); // taking value from user

        System.out.println("Number is : " + var1);
        System.out.println("Message is : " + var2);
    }

}
