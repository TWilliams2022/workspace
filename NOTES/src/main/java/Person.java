import java.util.ArrayList;

public class Person {
    int age;

    public Person(int age) {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    //    @Override
    public int compareTo(Person person) {
        int returnInt = 0;
        if (this.age == person.getAge()) {
            return 0;
        }
        return returnInt;
    }

}

class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person person10 = new Person(10);
        Person person6 = new Person(6);

    }

}