public class WrapperClass {

    private final double salary1 = 10.0; //0.0
    private final Double salary2 = salary1;
    private String name; //null


}

//main method

class Main{
    public static void main(String[] args) {
        int parseInt = Integer.parseInt("7");
       int sevenInt = Integer.parseInt(Character.toString('7'));
        System.out.println(parseInt);
        System.out.println(sevenInt);
    }

}