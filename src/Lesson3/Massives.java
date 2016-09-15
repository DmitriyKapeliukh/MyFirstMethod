package Lesson3;

/**
 * Created by Dmytro_Kapeliukh on 9/13/16.
 */
public class Massives {
    public static void main(String[] ags) {

        double a[] = new double[10];
        double w = Math.floor(Math.random()*10);
        System.out.println(w);


        double[] names = new  double[10];
        for (int i=0; i<names.length; i++) {
            names[i] = Math.floor(Math.random()*9);
        }
        for (int j=0; j<names.length; j++) {
            System.out.println(names[j]);
        }

    }
}
