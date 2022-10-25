package Enum;

public class EnumDay {

    public void displayDay(Day day){
        System.out.println(day);

        //toString
        System.out.println(day.toString());

    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY

}

class Main4 {
    public static void main(String[] args) {


        String classNameFfEnum = Day.FRIDAY.getClass().getName();
    }

}

