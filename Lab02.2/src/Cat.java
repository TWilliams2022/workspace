class Cat {

    //fields - Instance Variables
    private String name;
    private int weight;
    private String color;

    //constructor
    //creating this default constructor will allow me to use lines 6-8 on cat client
    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, String color) {
        this(name);
        this.weight = weight;
        this.color = color;
    }

    // business methods
   public void sleep()  {
        System.out.println("My favorite cat "+ getName() + " likes to sleep ZZZZZ!");
    }

   public void eat(){
        System.out.println("My favorite cat is " + getColor() + " and his name is " + getName() + " and he likes to eat mmmmm!");
    }

    public void purr(){
        System.out.println("My favorite cat weighs " + getWeight() + "lbs and he purrs loud!");
    }

    // Accessor methods - Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString()
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
