package Dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

class Main12{
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("now = " + today);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow's day is " + tomorrow);

        LocalDate localDate = LocalDate.of(1994, Month.NOVEMBER, 13);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        ZonedDateTime zoneTime = ZonedDateTime.now();
        System.out.println(zoneTime);


    }
}