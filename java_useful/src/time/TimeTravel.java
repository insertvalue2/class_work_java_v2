package time;

import java.time.LocalDate;     // 날짜만 다루기 위한 클래스
import java.time.LocalDateTime; // 날짜와 시간을 함께 다루기 위한 클래스

public class TimeTravel {

    public static void main(String[] args) {
        // 현재 날짜를 가져옴
        LocalDate today = LocalDate.now();
        System.out.println("오늘 날짜 : " + today);

        // 현재 날짜와 시간을 가져 옴
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 시간 : " + now);

    }

}
