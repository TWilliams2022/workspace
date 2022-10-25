package Dates;

import jdk.swing.interop.SwingInterOpUtils;

import javax.xml.datatype.DatatypeConfigurationException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.time.temporal.TemporalAdjusters.next;

public class DateAndTimeFormatter {

    public static void main(String[] args) {
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    // need to be the pattern specified in format time
        LocalDate localDate = LocalDate.parse("20-Mar-2020", formatTime);
        System.out.println(localDate);

LocalDate localDate1
        = LocalDate.of(2022,
        1,23);
String format
        = localDate1.format(
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(format);
        System.out.println();

    LocalDate kyrieBday = LocalDate.of(2015, 12,7);
        String display = kyrieBday.format(DateTimeFormatter.ofPattern("EEE, d MMM yyy"));

        LocalTime todayTime
                = LocalTime.of(17,20);
        String display2 = todayTime.format(DateTimeFormatter.ofPattern("h:mm a"));

        System.out.println();

                      LocalDate now2 = LocalDate.now();
                      LocalDate localDate3 = now2.withYear(2027);
        System.out.println(now2);
        System.out.println(localDate3);

        LocalDate now = LocalDate.now();
        LocalDate nextFriday
                = now.with(next(DayOfWeek.FRIDAY));
        System.out.println(nextFriday);





    }
}
