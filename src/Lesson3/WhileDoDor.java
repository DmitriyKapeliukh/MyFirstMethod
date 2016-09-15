package Lesson3;

/**
 * Created by Dmytro_Kapeliukh on 9/13/16.
 */
public class WhileDoDor {

    public static void main(String[] args){

        int i = 19;
        while (i>0) {

            System.out.println("ok");
            int y= --i;
            System.out.println(y);
        }

        int e = 23;
        do {
            System.out.println("ASS");
            --e;
        } while (e<16);

        int d = 10;
        for (int s = 0; d<s; s++){
            System.out.println("ok");
        }
    }

}
