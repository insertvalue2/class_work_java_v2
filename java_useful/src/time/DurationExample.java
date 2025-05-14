package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {
        // Duration 시간 차이를 계산할 때 사용
        LocalTime start = LocalTime.of(9, 0); // 오전 9시
        LocalTime end = LocalTime.of(11, 30);
        Duration duration = Duration.between(start, end);
        System.out.println("duration : " + duration);
        System.out.println("소요 시간 : " + duration.toMinutes() + "분");
        System.out.println("소요 시간 : " + duration.toSeconds() + "초");
    }
}
