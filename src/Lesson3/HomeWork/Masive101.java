package Lesson3.HomeWork;

import java.util.Random;

/**
 * Created by Dmytro_Kapeliukh on 9/15/2016.
 */
public class Masive101 {
    public static void main(String[] args) {
        double [] Sum  = new double [101];
        Random randomValue = new Random();
        for (int i = 0; i<Sum.length; i++) {
            Sum[i] = randomValue.nextInt(100);
            System.out.println(Sum[i]);
        }
    }
}
