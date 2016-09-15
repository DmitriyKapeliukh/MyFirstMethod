package Lesson2;

/**
 * Created by Dmytro_Kapeliukh on 9/8/16.
 */
public class ParamToConsol {

    static {
        

        int z = 44;
        int c = 33;

        if (z < c) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }


        int k = 12;
        switch (k) {

            case 0:
                System.out.println("Case");
            case 1:
                System.out.println("Case1");
            case 2:
                System.out.println("Case2");
            default:
                System.out.println(44);
        }
    }

    public static void main(String[] args) {
        int x = 33;
        int y = 22;
        String s = (x == 33) ? "No" : "Yes";

        System.out.println(s);
    }

}
