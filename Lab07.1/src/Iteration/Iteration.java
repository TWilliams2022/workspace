package Iteration;

public class Iteration {

    public void displayNumbersUsingForLoop(int start, int end) {

        for (int i = start; i < end; i++){
            System.out.println("incremented = " + i);
        }

    }

   public void displayNumbersUsingWhile(int start, int end){

        int i = start;
       while(i < end){
           System.out.println(i);
          i--;
       }
   }


    public void displayNumbersUsingDoWhile(int start, int end){

        int i = start;
        //do while loop
        do{
            //runs code 1st the check bottom
            System.out.println(i);
            //decrement
            i--;
        } while (i < end);
    }


    public void displayEvenNumbersOnlyUsingForLoop(int start, int end){

        for ( int i = start; i<=end ; i++){
            if (i % 2 == 0){
                System.out.println("this is a even # " + start);
            }
        }

    }

}

class IterationClient{
    public static void main(String[] args) {

    }
}
