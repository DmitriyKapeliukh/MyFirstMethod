package Lesson3.HomeWork;

import java.util.Random;

/**
 * Created by Dmytro_Kapeliukh on 9/15/2016.
 */
public class Masive100 {
    public static void main(String[] args) {
        int [] Rand = new int [100];
        Random randomValue = new Random();
        for (int i = 0; i<Rand.length; i++) {
            Rand[i] = randomValue.nextInt(100);
            System.out.println(Rand[i]);
        }
    }
}
