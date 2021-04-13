//package com.apps.yo.forjava.DateTimeRegex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class SetDate {

    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy";
        String dateStr = "28/01/2018"; // try "28/1/2018";

        try {
            DateFormat df = new SimpleDateFormat(pattern);
            Date today = df.parse(dateStr);
            System.out.println("Today = " + df.format(today));
            System.out.println("Today = " + today);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("=========================");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 10);
        cal.set(Calendar.MONTH, 10);// use month-1
        cal.set(Calendar.YEAR, 2019);

        //still want to convert to Date obj
        Date dt = cal.getTime();
        System.out.println(dt);



    }

}
