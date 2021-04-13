

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeZone {
    public static void main(String[] args) {

        LocalDateTime vilnius = LocalDateTime.now(ZoneId.of("Europe/Vilnius"));
        System.out.println("Current Date in Vilnius= "+ vilnius);

        LocalDateTime mumbai = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in India= "+ mumbai);

        LocalDateTime ny = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date in NY= "+ ny);

        System.out.println("================\n");


        //Set a variable with the local time in Mumbai (daytime+UTCoffset[ZoneId])
        ZonedDateTime mumbaiZone = ZonedDateTime.parse("2019-10-11T20:15:45+05:30[Asia/Kolkata]");//directly set the time
        System.out.println(mumbaiZone);
        LocalDateTime mumbai2 = mumbaiZone.toLocalDateTime();
        System.out.println(mumbai2);
            //now you can compare mumbai with mumbai2



       /* Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIds.size());
        for (String zone : allZoneIds){
            System.out.println(zone);
        }*/
    }
}
