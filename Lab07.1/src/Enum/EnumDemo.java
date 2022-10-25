package Enum;

public class EnumDemo {

    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;

    public void printDay(int day){
        System.out.println("today is " + day);

    }


}





class EnumClient{
    public static void main(String[] args) {

        EnumDemo day = new EnumDemo();
        day.printDay(EnumDemo.FRIDAY);
    }

}
