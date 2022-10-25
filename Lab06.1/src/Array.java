import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ints = new int[10]; //making the array 10 buckets #1
        Integer[] integers = new Integer[20];
        String[] strings = new String[5];
        People[] people = new People[7];

        System.out.println();

        //assigning my values in ints array #2
        ints[0] = 78; //0 place has 78 in it
        ints[1] = 78; //
        ints[2] = 78;
        int length = ints.length;
        System.out.println("length of ints array - " + length);
        System.out.println("length of ints string - " + strings.length);

        //sets specific array and places
     int[] ints1 = {1, 3, 6, 12}; // is the same as lines 11-13.
        readNames(ints1);

        String[] strings88 = {"Cindy","Kiaya"};
        String[] strings89 = {"Cindy","Kiaya"};

        System.out.println("results of toString()" + strings88.toString());
        System.out.println();
        System.out.println("results of Arrays.toString()" + Arrays.toString(strings88));

        //comparing String arrays
        boolean equals = strings88.equals(strings89); //false
        boolean equals2 = (strings88 == strings89); // false
        System.out.println( " ======== " + equals2); // false

        boolean equals1 = Arrays.equals(strings88, strings89);
        System.out.println("is this equal? " + equals1);

    }

    //defining method
    public static void readNames(int[] names){
        //used this method to place my readNames above
    }


}

class People{


}
