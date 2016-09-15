package Lesson4;

/**
 * Created by Dmytro_Kapeliukh on 9/15/16.
 */
public class PetMaster {


    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Чик!! Чирик!!");
        System.out.println(petReaction);
        myPet.sleep();
    }
}