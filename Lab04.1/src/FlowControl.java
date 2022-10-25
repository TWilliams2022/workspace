public class FlowControl {

    public static boolean isItEvenNumber(int number) {

        boolean isEven = true;
        if(number % 2 == 0){
            System.out.println(" # is true");
            return true;
        } else{
            System.out.println("this # is false");
        }
        return isEven;
    }
}

class EvenClient{
    public static void main(String[] args) {
        FlowControl.isItEvenNumber(1);
        FlowControl.isItEvenNumber(2);
        FlowControl.isItEvenNumber(3);
        FlowControl.isItEvenNumber(4);
        FlowControl.isItEvenNumber(10);
    }
}



