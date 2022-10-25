//study for 6.1 extra exercise

public class StringAndStringBuilderHW {

    public static void main(String[] args) {
        System.out.println("My Address W/ String - " );
        System.out.println();
        System.out.println();
        System.out.println();

    }

//    public static constructMyAdressUsingString(){
//        String myAddressString = new String("Draper St" + " " + "Greenville");
//
//
//    }

    public static String constructMyAddressUsingStringBuilder(){
        StringBuilder myAddressStringBuilder = new StringBuilder(100);
       myAddressStringBuilder.append("Draper St")
                .append(" ")
                .append("Greenville");
       return myAddressStringBuilder.toString();
    }
}