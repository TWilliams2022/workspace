import java.util.Arrays;

public class IteratingThroughStringAndCounting {
    public static void main(String[] args) {

        String str = "Hello I love Carolina. Yes, you do Love Carolina.";
        String[] arrayStr = str.replaceAll("[^a-zA-z]", " ").split("\\s+");
        System.out.println(Arrays.toString(arrayStr));

        for (int i = 0; i < arrayStr.length; i++) {
           int count = 1;
           //i + 1 is going to a different spot
            for (int j = i + 1; j < arrayStr.length ; j++) {
                if (arrayStr[i].equalsIgnoreCase(arrayStr[j])  ){
                    count++;
                }
            }
            System.out.println(arrayStr[i] + ": " + count);

        }

    }
}
