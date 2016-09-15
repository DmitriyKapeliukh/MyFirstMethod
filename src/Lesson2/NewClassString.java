package Lesson2;

/**
 * Created by Dmytro_Kapeliukh on 9/8/16.
 */
public class NewClassString {
    public static void main(String [] args) {

        String A = "123";
        String B = "456";
        String C = "789";

        boolean D = A == B;
        boolean E = B.equals(C);

        System.out.println(A == B);
        System.out.println(A.equals(B));
    }
}
