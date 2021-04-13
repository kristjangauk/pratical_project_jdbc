

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeEx {

    public static void main(String[] args) {

        //there will be no time-zone yyyy-mm-ddT11:24:53.
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);


        LocalDateTime ldt1 = LocalDateTime.of(1978,03,29,18,48,40,100);
        LocalDateTime ldt2 = LocalDateTime.parse("1978-03-20T18:48:40");
        LocalDateTime ldt3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());//combining both
        System.out.println(ldt1 +" | "+ ldt2 +" | "+ ldt3);
        System.out.println("=========================");


        LocalDateTime nowPlus = now.plusDays(3);
        System.out.println(nowPlus);
        LocalDateTime nowMinus = now.minusHours(4);
        System.out.println(nowMinus);

        //other methods to try
        //nowMinus.getMonth().toString();
        //nowMinus.getMonthValue();
        //nowMinus.getNano();
        //nowMinus.getDayOfYear();
    }//https://stackoverflow.com/questions/33337487/localdate-how-to-remove-character-t-in-localdate

}
