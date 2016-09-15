package Lesson4;

/**
 * Created by Dmytro_Kapeliukh on 9/15/16.
 */
public class Cat {
    int age;
    int birthday;

    //Инициализируем переменую явно
    Cat(int i, int j) {
        age =i;
        birthday = j;
    }

    //Инициализируем переменые одни и тем значением
    Cat(int i) {
        age = i;
        birthday = i;

    //Присваиваем значения по умолчанию 0
    /*Cat() {
            age = 0;
            birthday = 0;
        }*/
    }
}
