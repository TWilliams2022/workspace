public class ComputerClient {
    public static void main(String[] args) {

        //Grab each file and instantiate them separately
        //***********************************************
        ComputerUsingIntPrimitives computer = new ComputerUsingIntPrimitives();
        int addValue = computer.add(10,20);
        int subtractValue = computer.subtract(100,250);
        int multiply = computer.multiply(100,100);
        int divideValue = computer.divide(81,9);

        System.out.println("addition int value: "+addValue+ "  | subtraction int value: " +subtractValue+ " | multiplication int value: " +multiply+ "  | division int value: " +
                divideValue);

        //Grab each file and instantiate them separately
        //***********************************************
        ComputerUsingLongPrimitives computer2 = new ComputerUsingLongPrimitives();
        long addValue2 = computer2.add(100L, 200L);
        long subtractValue2 = computer2.subtract(200L, 100L);

        System.out.println("addition long value: "+addValue2+ "  | subtraction long value: " + subtractValue2);
        System.out.println();

        //Grab each file and instantiate them separately
        //***********************************************
        ComputerUsingOverloadedMethods computer3 = new ComputerUsingOverloadedMethods();
        int addValue3 = computer.add(11,21);
        int subtractValue3 = computer.subtract(101,252);
        long addValue4 = computer3.add(200L, 500L);
        long subtractValue4 = computer3.subtract(200L, 500L);

        System.out.println("addition int value: "+addValue3+ "  | subtraction int value: " + subtractValue3);
        System.out.println("addition long value: "+addValue4+ "  | subtraction long value: " + subtractValue4);

    }
}
