public class Person {

    //fields
    private String name;
    private int age;

    //constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Keep empty constructor to stay on safe side ***
    public Person() {

    }


    //business class - like a sentence
    public String getPersonInfo(){
        return name + " " + age;
    }

    //accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //



}

class PersonClient{
    public static void main(String[] args) {
        Person person = new Person("Ty'Reik", 27);
        System.out.println(person.getPersonInfo());

        Person person2 = new Person();
        person2.setName("Jasmine");
        person2.setAge(26);
        System.out.println(person2.getPersonInfo());
    }
}

