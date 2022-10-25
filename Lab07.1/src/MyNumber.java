//look over from previous exercises 2

public class MyNumber {

//    double start = Math.random() * 21;
//    double end = Math.random();
    public static int computeRandomInt(int start, int end){
    int diff = end - start;
    return (int) (Math.random() * diff) + start;

    }
}

class MyNumberClient{

    public static void main(String[] args) {

       int test = MyNumber.computeRandomInt(1,20);
        System.out.println(test);


    }


}
