package Inheritance;

public class Boat extends Vehicle {

    public Boat(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String destination) {
        System.out.println("moved by Boat");
    }

}
