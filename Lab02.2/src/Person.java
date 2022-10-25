public class Person {
    public static void myPublicStaticMethod(){
    }
}

class Toy{
    public void anotherMethod(){
        Person.myPublicStaticMethod();
        Math.abs(10);

    }
}

