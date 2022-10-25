public class IterationThroughWordsEX {
    public static void main(String[] args) {
        // contain my string
        String initialSentence = "Hello I love Boston. Yes, you do love Boston.";
       //contain string while it's being split
        String[] initialWords = initialSentence.split("[,?.@]+");


        String[] uniqueWords = new String[initialWords.length];
        int[] numberOfTimes = new int[initialWords.length];
        int currentIndex = 0; //What is the next available slot.

        for (int i = 0; i < initialWords.length ; i++) {
            //I need to know if initialWords[i] is already found
            // then I need to know the current index of
            //the location where the previous word is located
            //else
            //use the currentIndex to uniqueWords[currentIndex] = initialWords[i]
            //numberOfTimes[currentIndex] = 1
            //
            //

        }
    }
}
