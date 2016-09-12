/**
 * Created by Dmytro_Kapeliukh on 9/8/16.
 */
public class MyFirstClass {
    public static void main(String[] args) {
        MyFirstMethod();
        MySecondMethod();
        MyThirdMethod();

    }

    public static void MyFirstMethod() {
        int a = 3;
        short aa = (short)12;
        long aaa = (long)44;

        String test5 = "  Это строка   ";
        String test6 = test5.trim();
        System.out.println(test6);

    }

    public  static void MySecondMethod() {
        String test5 = "  Это строка   ";
        String test7 = "еще одна строка";
        String test6 = test5.concat(test7);
        String test8 = test5 +" " +"olga";
        String test9 = "хахахаха";
        String test10 = test8 +=test5;
        System.out.println(test10);

    }



    public  static void MyThirdMethod() {

        String test11 = "yes";
        String test12 = "yes";
        boolean test13 = test11.equals(test12);
        System.out.println(test13);
    }
}

