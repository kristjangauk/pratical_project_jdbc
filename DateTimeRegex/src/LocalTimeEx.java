
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeEx {

    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);//till millisecs and defautlt is 24hrs

        LocalTime nineMorning = LocalTime.parse("09:30");
        LocalTime tenNight = LocalTime.parse("22:30");
        System.out.println( nineMorning +"|"+ tenNight );
        System.out.println("===========================");

        LocalTime nine = LocalTime.of(9, 00);
        LocalTime nineThirtyPM = LocalTime.parse("09:30").plus(12, ChronoUnit.HOURS);
        LocalTime afterMinus = nine.minus(25,ChronoUnit.HOURS);

        System.out.println(nine);
        System.out.println(nineThirtyPM);
        System.out.println(nineThirtyPM.getHour());
        System.out.println(afterMinus);
        System.out.println("===========================");



        boolean isbefore = LocalTime.parse("01:30").isBefore(LocalTime.parse("00:30"));
        System.out.println(isbefore);
    }
}
//Brilliant Question that covers a multitude of unique solutions!
//https://stackoverflow.com/questions/28353725/java-subtract-localtime