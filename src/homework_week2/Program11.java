package homework_week2;

/**
 * Write a Java program to display the following pattern.
 * Sample Pattern :
 *  J a v v a
 *  J a a v v a a
 * J J aaaaa V V aaaaa
 * J J a a V a a
 */
public class Program11 {
    public static void main(String[] args) {
        Program11 obj = new Program11();
        obj.meth1();
    }

    public void meth1() {
        System.out.println("J  a v  v a");
        System.out.println("J a a v v aa");
        System.out.println("J J aaaaa VV aaaaa");
        System.out.println("J J a  a V a   a");
    }
}
