package time;

import java.util.Calendar;
import java.util.Date;

public class OldDateExample {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("현재 시간 : " + now);

        // 직접 new 못하게 개발자가 막아 놓았다.
        // Calendar cal = new Calendar();
        Calendar cal = Calendar.getInstance();
        cal.set(2025, 4, 14); // 0부터 시작 (5월 == 4 ) 0부터 시작이라서
        System.out.println("설정된 날짜 : " + cal.getTime());
    } // end of main

} // end of class
