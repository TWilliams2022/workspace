package Arrayz;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        //create array of int with size 10
        int[] intz = new int[10];
        //-------------------------
        int x = 7;
        int y = 3;
        //the new keyword is creating a object
        int[] ints = new int[x + y];
        int[] ints1 = new int[ints.length];

        //have to sout Arrays.toString to get results
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));

        //created an Array of String type but elements are null
        String[] myArrayString = new String[3];

        //how do you create a array of int
        int[] ints3 = {1, 2, 4, 5, 6, 7, 23, 534, 98};
        System.out.println(Arrays.toString(ints3));

        //how do you fine the largest number
        int whatIsTheLargestNumber = ints3[0];
        for (int i = 0; i < ints3.length; i++) {
            if (whatIsTheLargestNumber < ints3[i]) {
                whatIsTheLargestNumber = ints3[i];
            }
            System.out.println("it is " + whatIsTheLargestNumber);
        }

        //change each number in array x2
        for (int i = 0; i < ints3.length; i++) {
            ints3[i] = ints3[i] * 2;
        }

        //create array with string of 10 and assign family name
        String[] familyMembers = new String[10];
        familyMembers[0] = "tyreik";
        familyMembers[1] = "jasmine";
        familyMembers[2] = "Kyrie";
        System.out.println(Arrays.toString(familyMembers));

        //create any array of string
        String[] myStringNumbers = {"2", "40", "7", "5"};
        int[] myIntNumbers = new int[myStringNumbers.length];
        //create a new array of int from the array^^^
        for (int i = 0; i < myStringNumbers.length; i++) {
            myIntNumbers[i] = Integer.parseInt(myStringNumbers[i]);
        }
        System.out.println(Arrays.toString(myIntNumbers));

        //split array "i love Boston, Yes, I do love BOSTON."
        String testString = "I love Boston. Yes. you do love Boston.";
        String[] stringArray = testString.split("[,?.@&$]+");


        //create a new array from above string
        //should be lowercase.
        String[] uniqueWords = new String[stringArray.length];
        int currentIndex = 0;

        for (int i = 0; i < stringArray.length; i++) {
            //current index return size of array
            boolean isTheWordFound = isTheWordFound(uniqueWords,
                    stringArray[i],
                    currentIndex);
            if (isTheWordFound) {
                continue;
            } else {
                uniqueWords[currentIndex++] = stringArray[i];
            }
        }

        for (int i = 0; i < currentIndex; i++) {
            System.out.println(uniqueWords[i] + " ");

        }

        //create an array of "char" from a String "Life is good" display the array
       char[] charArray = new char[testString.length()];




    }

    private static boolean isTheWordFound(String[] uniqueWords, String wordToFind, int currentIndex) {
        boolean found = false;

        for (int i = 0; i < currentIndex; i++) {
            if (uniqueWords[i].equalsIgnoreCase(wordToFind)) {
                found = true;
            }
        }
        return false;
    }


}


