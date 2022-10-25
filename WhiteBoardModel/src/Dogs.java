public class Dogs {

    //Place fields, constructors, business methods, accessor methods, toString()
    // in the recommended order in your business class

    //================================================================================================
    //FIELDS
    // -- Implement data encapsulation
    public static final int MIN_AGE = 1;
    public static final int MAX_AGE = 10;

    private int age;
    private String origin;
    private String color;
    DogType whatKindOfDog = DogType.valueOf("Doberman");


    //================================================================================================
    //CONSTRUCTOR
    //creating this default constructor will allow me to use lines 6-8 on cat client
    public Dogs() {
    }

    public Dogs(int age) {
        this.age = age;
    }

    public Dogs(int age, String origin, String color) {
        this(age);
        this.origin = origin;
        this.color = color;
    }

    //================================================================================================
    // BUSINESS METHOD
    public void ageNow() {
        System.out.println("My dog is " + getAge() + " years old!");
    }

    public void originNow() {
        System.out.println("My dog is from " + getOrigin() + " and it's " + getColor() + "!");
    }

    public void colorNow() {
        System.out.println("My dog is " + getColor() + "!");
    }

    //================================================================================================
    // ACCESSOR METHODS
    // - Getter Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //================================================================================================

    //TO STRING!!

    @Override
    public String toString() {
        return "Dogs{" +
                "age=" + age +
                ", origin='" + origin + '\'' +
                ", color='" + color + '\'' +
                ", whatKindOfDog=" + whatKindOfDog +
                '}';
    }
}
