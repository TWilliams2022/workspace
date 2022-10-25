package Inheritance;

public class Cars extends vehicles{
    //vehicle knows nothing of car fields
    private String make;
    private String model;
    
    public Car(String vin){
        super(vin);
    }
  //-----  
}

class CarClient{
    public static void main(String[] args) {
        Car c = new Car("ABC123");
        String vin = c.getVin();
        System.out.println(vin);

        Vehicle xyz123 = new Car("XYZ123);

        DMV dmv = new DMV();
        dmv.register(car);
    }
    
}


