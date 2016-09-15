package Lesson2;

/**
 * Created by Dmytro_Kapeliukh on 9/12/16.
 */
public class ShortLongString {

    public static void main (String[] args) {

        String x = "This is string";
        String x1 = "This is my string";

        //int lenX = x.length();
        //int lenX1 = x1.length();

        if (x.length()>x1.length()) {
            System.out.println("The longest string is" +" "+x);
            System.out.println("The lenght is" +" "+x.length());
        }
        else if (x.length()<x1.length()) {
            System.out.println("The longest string is" +" "+x1);
            System.out.println("The lenght is" +" "+x1.length());
        }
        else {
            System.out.println("The lenghts are equal");

        }
    }
}
