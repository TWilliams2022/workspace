public class ArrayExample {

    //Create an array of String as a field of the class and initialize it with 3 or more names of your family (or friends)
    private static final String[] family = {"Jasmine", "Kyrie", "Tyreik"};

    //Add and implement a method called "void convertAndDisplayNamesToUpperCase()",
    // in which you are going to use a for-loop to display uppercase name of each member of your family
    public static void convertAndDisplayNamesToUpperCase() {
        for (int i = 0; i < family.length; i++) {
            String upperCaseMe2 = family[i].toUpperCase();
            System.out.println(upperCaseMe2);
        }
    }

    //_____________________________________________________________________________________________________
    public static int[] numbers = {1, 2, 3, 4, 5, 6 ,7 ,8,9};
    //Add and implement a static method called "int[] findOddNumbersFromArray(int[] numbers) #1
    //which takes an array of int argument and returns a new array of int with only odd numbers
    public static int findOddNumbersFromArray() {
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] % 2 == 1){
                System.out.println("this is odd - " + numbers[i]);
                return numbers[i];
            }
        }
        return 0;
    }


    //_____________________________________________________________________________________________________
//    public static int largestNumber = new int[]{8, 3, 2, 1, 4, 5, 6, 10, 8, 2, 3};
//    public static int findLargestNumberFromArray(int[] numbers){
//        int LargestNumber = 0;
//        for (int currentIndex = 0; currentIndex < numbers.length ; currentIndex++) {
//            if (numbers[currentIndex] > largestNumber ){
//                largestNumber = numbers[currentIndex];
//            }
//        }
//
//
//    }
}


class ArrayExampleClient {

    public static void main(String[] args) {
//Call class here then call method
        ArrayExample.convertAndDisplayNamesToUpperCase();

        //Add client code to invoke the method with test int array of {1,2,3,4,5,6,7,8,9} #3
        ArrayExample.findOddNumbersFromArray();

    }


}