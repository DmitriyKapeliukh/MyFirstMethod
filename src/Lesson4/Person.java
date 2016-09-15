package Lesson4;

/**
 * Created by Dmytro_Kapeliukh on 9/15/16.
 */
public class Person {
    String firstname;
    String middleame;
    String lastName;
    int birthYear;

    public Person(String firstname, String middleame, String lastName, int birthYear) {
        this.firstname = firstname;
        this.middleame = middleame;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void PersonTest() {
        Person test1 = new Person("New","User", "Created", 12);
        Person test2 = new Person("Second", "User", "Created", 44);
        Person test3 = new Person("NewSecond", "User", "Created", 55);

    }

    public String getFullName() {
        return firstname+middleame+lastName;
    }

    private int getAge(int currentYesr) {
        return currentYesr = birthYear;
    }

    public String getInfo() {
        return firstname+" "+middleame+" "+lastName+" "+birthYear;
    }

    public void setInfo() {
        this.birthYear = 33;
        this.firstname = "Main";
        this.middleame = "Mama";
        this.lastName = "Oldest";
    }
}
