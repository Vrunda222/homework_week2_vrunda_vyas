package homework_week2;

import java.util.Scanner;

/**
 * Write a Java Program to print as below.
 * "+------------------------+"
 * "|                        |"
 * "|      CORNER STORE      |"
 * "|                        |"
 * "|   2015-03-29 04:38PM   |"
 * "|                        |"
 * "|    Gallons: 10.870     |"
 * "|  Price/gallon: $ 2.089 |"
 * "|                        |"
 * "|  Fuel total: $ 22.71   |"
 * "|                        |"
 * "+------------------------+"
 */
public class Program20 {
    static String storeName, todayDate, currentTime;

    public static void main(String[] args) {
        System.out.println("Result by direct print:");
        direct();
        System.out.println("");
        System.out.println("Result by scanner:");
        scannerClass();

    }

    public static void direct() {

        System.out.println("''+------------------------+''");
        System.out.println("''|                        |''");
        System.out.println("''|      CORNER STORE      |''");
        System.out.println("''|                        |''");
        System.out.println("''|   2015-03-29 04:38PM   |''");
        System.out.println("''|                        |''");
        System.out.println("''|    Gallons: 10.870     |''");
        System.out.println("''|  Price/gallon: $ 2.089 |''");
        System.out.println("''|                        |''");
        System.out.println("''|  Fuel total: $ 22.71   |''");
        System.out.println("''|                        |''");
        System.out.println("''+------------------------+''");

    }

    public static void scannerClass() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter store name: ");
        storeName = sc.nextLine();

        System.out.print("Enter date: ");
        String date = sc.nextLine();

        System.out.print("Enter time: ");
        String time = sc.nextLine();

        System.out.print("Enter gallons value: ");
        double gValue = sc.nextDouble();

        System.out.print("Enter gallons price: ");
        double gPrice = sc.nextDouble();

        System.out.print("Enter fuel total: ");
        float fTotal = sc.nextFloat();

        System.out.println("''+------------------------+''");
        System.out.println("''|                        |''");
        System.out.println("''|       "+storeName+"     |''");
        System.out.println("''|                        |''");
        System.out.println("''|  "+date+"  "+time+"   |''");
        System.out.println("''|                        |''");
        System.out.println("''| Gallons:       " +gValue+"   |''");
        System.out.println("''| Price/gallon: "+"$ "+gPrice+"  |''");
        System.out.println("''|                        |''");
        System.out.println("''| Fuel total:  "+"$ "+fTotal+"   |''");
        System.out.println("''|                        |''");
        System.out.println("''+------------------------+''");

    }
}
