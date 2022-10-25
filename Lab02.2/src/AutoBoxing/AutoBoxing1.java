package AutoBoxing;

public class AutoBoxing1 {


    public static void main(String[] args) {
        //example of autoboxing
        Integer[] myIntegerArray = {1,2,3,4,5,6,};

        //example of unboxing
        int[] myIntArray = new int[myIntegerArray.length];

        for (int i = 0; i < myIntegerArray.length ; i++) {
            myIntArray[i] = myIntegerArray[i];
        }

        System.out.println(myIntArray);
    }

}
