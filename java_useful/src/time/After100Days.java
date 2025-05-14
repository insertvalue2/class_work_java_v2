package time;


import java.time.LocalDate;

public class After100Days {

    public static void main(String[] args) {
        // 현재 날짜로 부터 100일 후의 날짜를 계산하고 출력하기
        LocalDate today = LocalDate.now();
        LocalDate after100Days = today.plusDays(100);
        System.out.println("100일 후 : " + after100Days);
    }
}


