/**
 * Created by Dmytro_Kapeliukh on 9/8/16.
 */
public class WorkWithString {
    public static void main(String[] args) {

        String attention = "Внимание: ";
        System.out.println(attention);

        String s = attention+ "неизвестный символ";
        System.out.println(s);

        String a = attention +=s;
        //String b = a.concat(s);
        System.out.println(a);

        System.out.println(a.length());
        char test11 = s.charAt(5);
        System.out.println(test11);

    }
}
