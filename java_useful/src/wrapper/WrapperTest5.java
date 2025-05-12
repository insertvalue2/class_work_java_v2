package wrapper;

import java.util.ArrayList;

public class WrapperTest5 {

    public static void main(String[] args) {
        // 컬렉션 프레임워크에서의 사용
        // 컬렉션은 객체만 저장 가능. 즉 래퍼 클래스를 사용해 처리해야 한다.
        // 정수 값(래퍼 클래스)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(20); // 자동 박싱 (int -> Integer)

        int sum = numbers.get(0) + numbers.get(1); // 자동 언박싱
        System.out.println("합계 : " + sum);

    } // end of main
}
