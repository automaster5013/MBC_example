package d5.p59;

public class Person implements java.lang.Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person arg0) {
//        if (age < arg0.age)
//            return -1;
//        else if (age == arg0.age)
//            return 0;
//        else
//            return 1;

        if (arg0.age < age)
            return -1;
        else if (age == arg0.age)
            return 0;
        else
            return 1;
    }
}
