package Animal;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void breathe();

    public String getName() {
        return name;
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println( getName() + " breathe by Cat");
    }

}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Dog");
    }

}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Bird");
    }
}

class AnimalHospital {

    Animal[] animals;
    int numberOfValidAnimals;

    public AnimalHospital(Animal[] animals, int numberOfValidAnimals) {
        this.animals = animals;
        this.numberOfValidAnimals = numberOfValidAnimals;
    }

    public void letAllAnimalsBreathe() {
        for (Animal animal : animals) {
            System.out.println(animal);  // toString() automatically called
        }
    }
}

class AnimalHospitalClient {

//    private static Animal[] animals = new Animal[100];
   static private Collection<String> animals = new ArrayList<>();

    public static void main(String[] args) {

        animals.add(new Cat("Jasmine").getName());
        animals.add(new Dog("Kyrie").getName());
        animals.add(new Bird("Tyreik").getName());
        System.out.println(animals);
        System.out.println("My animals above");
        System.out.println("other way at bottom");
        Cat cat = new Cat("jon");
        System.out.println(cat);
        Dog dog1 = new Dog("chally");
        System.out.println(dog1);
        Bird paul = new Bird("paul");

    }
}
