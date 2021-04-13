

import java.time.Instant;



public class UnixEpoch {

    public static void main(String[] args) {
        // current time Unix
        Instant unixTime = Instant.now();
        System.out.println("unixTime: " + unixTime);

        // Add 100 seconds
        Instant unixTime5 = unixTime.plusSeconds(5);
        System.out.println("unixTime5: " + unixTime5);

        //unix timestamp is unixTime in seconds... Epoch means "from the beginning"
        long unixTimestamp = unixTime.getEpochSecond();
        System.out.println("unixTimestamp: " + unixTimestamp);
        System.out.println("unixtime+5sec: " + unixTime5.getEpochSecond());


        // unixtimestamp in millisecs... Epoch means "from the beginning"
        long unixTimestampMs = unixTime.toEpochMilli();
        System.out.println("Epoch Millisecs: " + unixTimestampMs);
        long millisecs = System.currentTimeMillis();//from our DateUtil
        System.out.println("SystemMillisecs: " + millisecs);

        //https://youtu.be/zZwzrlLc_oc
        //https://www.javatpoint.com/how-to-calculate-date-difference-in-java










    }
}
