package homework_week2;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Program16 {

    static String a = "10", b = "11";

    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {
        // converting binary string into integer(decimal number)
        int x = Integer.parseInt(a,2);

        // converting binary string into integer(decimal number)
        int y = Integer.parseInt(b, 2);

        // Adding those two decimal numbers and storing in sum
        int sum = x + y;

        // Converting that resultant decimal into binary string
        String result = Integer.toBinaryString(sum);

        System.out.println(result);
    }
}
