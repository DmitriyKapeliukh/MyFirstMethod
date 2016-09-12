import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;

/**
 * Created by Dmytro_Kapeliukh on 9/11/16.
 */
public class HomeWork2 {

    public static void main(String[] args) throws Exception {

        Locale.getDefault();

        String A = "This is";
        String B = " my first";
        String C = " test";

        String AB = A.concat(B);
        String ABC = AB.concat(C);
        String AAA = A + "" + B + "" + C;
        String BBB = AB += C;

        System.out.println(ABC);
        System.out.println(AAA);
        System.out.println(BBB);

        String S = "String is still immutable";
        System.out.println(S.length());

        System.out.println(S.toLowerCase());
        System.out.println(S.toUpperCase());

        String D = "My String is still immutable";
        String E = D.substring(19, 28);
        System.out.println(E);

        String H = "replaced";
        String G = D.replace("immutable", H);
        System.out.println(G);

        StringBuffer I = new StringBuffer(D);
        I.delete(10, 18);
        System.out.println(I);

        String O = "   This is still immutable  ";
        String M = O.trim();
        System.out.println(M);

        String L = "implementation";
        String N = L.toUpperCase().replace("M", "m");
        System.out.println(N);


        System.out.println(Locale.getDefault());

    }

}
