public class Main2 {
    // can give these values in myMethod()
    private static int myIntField; //0
    private static String myStringField; // null

    public static void main(String[] args) {
    myMethod();
    }

    // call myMethod above to run
    //can put values inside (int, string, ect.)
    private static void myMethod(){
        //Can't use public or private on local variables
        int myLocalInt = 3;
        String myLocalString = "Will";

        System.out.println(myLocalInt + " \n" + myLocalString);
        System.out.println(myIntField + " " + myStringField);

    }
}
