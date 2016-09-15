package Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Dmytro_Kapeliukh on 9/12/16.
 */
public class SeasonsCalendar {

    public static void main (String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String SeasonName;
        int MonthNumber = Integer.valueOf(reader.readLine());


        if (MonthNumber == 12 || MonthNumber == 1 || MonthNumber == 2) {
            SeasonName = "Winter";
        } else if (MonthNumber == 3 || MonthNumber == 4 || MonthNumber == 5) {
            SeasonName = "Spring";
        } else if (MonthNumber == 6 || MonthNumber == 7 || MonthNumber == 8) {
            SeasonName = "Summer";
        } else if (MonthNumber == 9 || MonthNumber == 10 || MonthNumber == 11) {
            SeasonName = "Autumn";

        } else {
            throw new IllegalArgumentException();

        }
        System.out.println(SeasonName);

    }
}
