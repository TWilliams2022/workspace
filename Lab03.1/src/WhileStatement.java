public class WhileStatement {

}

class MainWhile<index3> {
    public static void main(String[] args) {
        int index = 5;

        //while loop (used commonly)
        while(index > 0){
            System.out.println("index is " + index );
            index--;
        }

        //do while loop
        int index2 = 4;
        do{
            //runs code 1st the check bottom
            System.out.println("index2 = " + index2);
            //decrement
      index2--;
        } while (index2 > 0);

        //for loop
    //increment
        for (int index3 = 0; index3 < 101; index3++){
            System.out.println("index 3 = " + index3);

        }

        int [] ages = {10, 20, 17, 80};
        //age is initialized
        for (int age : ages){
            System.out.println(age);
        }

        String [] names = {"Ty'Reik", "Jasmine", "Kyrie"};
        //age is initialized
        for (String name : names){
            System.out.println(name);
        }

    }


}