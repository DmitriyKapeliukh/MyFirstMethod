package Lesson3.HomeWork;

/**
 * Created by Dmytro_Kapeliukh on 9/15/2016.
 */
public class FirstTenInt {
    public static void main(String[] args) {

        int a = 1;
        int b = 10;
        for (int i=1; i<b; i++ ) {
            a = i*a;
            System.out.println(a);
        }
    }
}
