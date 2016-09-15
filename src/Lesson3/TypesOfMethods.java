package Lesson3;

import java.lang.reflect.Method;

/**
 * Created by Dmytro_Kapeliukh on 9/13/16.
 */
public class TypesOfMethods {

    public void main(String[] args) {
        Olga test = new Olga();
        int test32 = test.Method();
        test.Calc(test32);
    }

    class Olga {
        public int Method(){
            int test1 = 12;
            int test2 = 14;
            return test1+test2;
        }
        public int Calc(int test) {
            System.out.print(test+1);
            return test+1;
        }
    }
}
