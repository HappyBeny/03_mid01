package time;

import java.time.ZoneId;

public class QZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneIds : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneIds);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
        //이거 컴파일오류 왜뜸
    }
}
