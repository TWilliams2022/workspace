//Main Method is where you assign those values and add your own
public class CatClient {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Sam", 10,"orange");
//        cat1.setName("Sam");
//        cat1.setColor("orange");
//        cat1.setWeight(10);
        cat1.eat();
        cat1.sleep();
        cat1.purr();

        System.out.println();

        Cat cat2 = new Cat("Jack", 20, "black");
        //able to take away lines 17-19 because they're now ^^^^^
//        cat2.setName("Jack");
//        cat2.setColor("black");
//        cat2.setWeight(20);
        cat2.eat();
        cat2.sleep();
        cat2.purr();

    }
}
