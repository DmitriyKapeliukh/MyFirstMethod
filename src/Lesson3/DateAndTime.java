package Lesson3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Locale;

/**
 * Created by Dmytro_Kapeliukh on 9/13/16.
 */
public class DateAndTime {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2016, Month.APRIL, 20);
        LocalDate date2 = LocalDate.of(2016, 3, 5);
        System.out.println(date1);
        System.out.println(date2);

        LocalTime time1 = LocalTime.of(5, 34);
        LocalTime time2 = LocalTime.of(3, 23, 23);
        LocalTime time3 = LocalTime.of(3, 23, 23, 535);
    }
}
