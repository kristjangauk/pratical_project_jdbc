

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateEx {

    public static void main(String[] args) {

        //only Date without a time-zone as yyyy-mm-dd eg. 2019-10-21.
        LocalDate localdt = LocalDate.now();
        System.out.println(localdt);
        System.out.println("===========================");

        // LocalDate other Creations
        LocalDate localdt1 = LocalDate.of(2019, 9, 11);
        System.out.println(localdt1);//try 31 java.time.DateTimeException: Invalid date 'SEPTEMBER 31'

        LocalDate fromString = LocalDate.parse("1999-10-03");//.parse("1999-10-3") .....  java.time.format.DateTimeParseException: Text '1999-10-3' could not be parsed at index 8
        System.out.println("LoacalDate Object from String date: " + fromString);
        System.out.println("===========================");

        System.out.println("Today is: " + LocalDate.now());
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow is: " + tomorrow);
        LocalDate dayBefore = LocalDate.now().minusDays(1);
        System.out.println("DayBefore is: " + dayBefore);



        LocalDate previousMonthSameDay1 = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        LocalDate previousMonthSameDay2 = LocalDate.now().minusMonths(1);
        System.out.println("Same Result: " + previousMonthSameDay1 +" | "+ previousMonthSameDay2 );
        System.out.println("===========================");


        DayOfWeek dayOfweek = LocalDate.parse("1978-03-29").getDayOfWeek();//this returns an enum
        System.out.println(dayOfweek);
        System.out.println(dayOfweek.toString());
        System.out.println(dayOfweek.getValue());
        System.out.println("==========================");

        // boolean leapYear = LocalDate.now().isLeapYear();
        boolean isAfter = LocalDate.parse("2015-09-11").isAfter(LocalDate.parse("2010-04-30"));
        int comparing =  LocalDate.parse("2015-09-11").compareTo((LocalDate.parse("2010-04-30")));
        System.out.println( isAfter +" | "+  comparing);
    }
}
