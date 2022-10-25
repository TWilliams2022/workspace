public class ExampleOfStaticMethod {
    //instance method or regular method
    //instance method can call static method
    // can happen then other way around
    public static void main(String[] args) {
        prepare();
        addToppings();
        bake();
    }

    private static void prepare(){
        System.out.println();
    }
    private static void addToppings(){
        System.out.println();
    }
    private static void bake(){
        System.out.println();
    }

}
