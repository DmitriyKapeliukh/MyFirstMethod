package Lesson3.HomeWork;

/**
 * Created by Dmytro_Kapeliukh on 9/15/2016.
 */
public class Cycle {
    public static void main(String[] args) {
        int [] array = new int[100];
        int sum = 0;

        for (int i = 0; i<array.length; i++) {
            if (i%2 == 0) {                                         //"%" остаток от деления
                array[i] = (int) Math.floor(Math.random()*(-10));
                sum += array[i];
            }
            else {
                array[i] = (int) Math.floor(Math.random()*(10));
                sum += array[i];
            }
            System.out.println(array[i]+" "+ sum);
        }
    }
}
