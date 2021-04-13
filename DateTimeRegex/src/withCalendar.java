

import java.util.Calendar;
import java.util.Date;

public class withCalendar {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();//static method set up
        System.out.println("Calendar Object: \n" +   cal);
        System.out.println("=======================");

        Date dt = cal.getTime();//create date Object from calendar
        System.out.println( dt );
        System.out.println("=======================");

        Date dt1 = new Date();
        cal.setTime(dt1); // convert Date to Calendar
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR) + "/365");
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR)+ "/52" );
        //program to print eg. 22nd April, 2020. ????
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));


        System.out.println("=======================");
        System.out.println("Now: " + cal.getTime());

        cal.add(Calendar.HOUR, 10);//add 24hrs
        System.out.println("+10hrs: " + cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, 30);
        System.out.println("+30 days: " + cal.getTime());
        cal.add(Calendar.DATE,15);//like adding 5 days
        System.out.println("+15 days: " + cal.getTime());

        cal.add(Calendar.WEEK_OF_YEAR,2);
        System.out.println("+2 weeks: " + cal.getTime());

        cal.add(Calendar.YEAR, -1);
        System.out.println("Less 1yr: " + cal.getTime());

        System.out.println("=======================");
    }
}
