

import java.util.Date;

public class withDateUtil {

    public static void main(String[] args) {

        // create a date object with current date & time.
        Date dt1 = new Date();
        System.out.println(dt1);
        
        //get the milli secs in Long from January 1st 1970 00:00:00 GMT... and then create the date Obj from that
        long millisecs = System.currentTimeMillis();
        System.out.println(millisecs);
        Date dt2 = new Date(millisecs);
        System.out.println(dt2);
        System.out.println("=========================");

        millisecs = dt2.getTime();//convert dateObj back to millisecs
        System.out.println(millisecs);
        System.out.println("dt2.toString(): " + dt2.toString());
        System.out.println("=========================");

        //check if after?
        System.out.println(dt1.after(dt2)); 
        System.out.println(dt2.after(dt1));
        //check if before?
        System.out.println(dt1.before(dt2));
        System.out.println(dt2.before(dt1));



        System.out.println("=========================");

        // compare 2 date Objects
        //returns 0 if the obj Date is equal to parameter's Date.
        //returns < 0 if obj Date is before the Date para.
        //returns > 0 if obj Date is after the Date para.
        int result = dt1.compareTo(dt2);
        System.out.println("dt1 < dt2: " + result);
        result = dt2.compareTo(dt1);
        System.out.println("dt2 > dt1: " + result);

        System.out.println("=========================");

        //return true/false on testing equality
         System.out.println(dt1.equals(dt2));
         System.out.println(dt2.equals(dt1));
        System.out.println("=========================");





    }




}
