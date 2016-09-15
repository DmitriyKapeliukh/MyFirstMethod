package Lesson4;

/**
 * Created by Dmytro_Kapeliukh on 9/15/16.
 */
public class Fish extends Pet {

    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        System.out.println("Ныряю на глубину "
                + howDeep + " футов");
        System.out.println("Я на глубине "
                + currentDepth + " футов ниже уровня моря");
        return currentDepth;
    }

    /*Fish(int currentDepth) {
        this.currentDepth = currentDepth;

    }*/
}
