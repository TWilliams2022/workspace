// creating person object/Type
//class definition
class Person {

    //properties / fields
    String name;
    int age;

    //behavior methods
    void standUp(){
        System.out.println("I'm standing up!");
    }

    void drink(){
        System.out.println("I'm drinking!");
    }

}

//main code
class Main {
    public static void main(String[] args) {
        //instantiating
        // referencing the person variable = new Person - is creating a new Person Object
        Person person = new Person();
        //now person can do something
        person.drink();
    }
}

