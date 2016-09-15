package Lesson3;

/**
 * Created by Dmytro_Kapeliukh on 9/13/16.
 */
public class Exeptional {
    public static void main(String[] ags) {

        int num1, num2;
        try {

            num1 = 0;
            num2 = 62/0;

            System.out.println("Try block message");
        } catch
                (ArithmeticException e) {

            System.out.println("Don't divide method by zero");
        }

            System.out.println("I'am out of try-catch block in Java");
    }
}
