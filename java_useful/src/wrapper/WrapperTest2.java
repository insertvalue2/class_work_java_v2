package wrapper;

public class WrapperTest2 {

    public static void main(String[] args) {
        // 도전 문제
        // double 데이터 타입을 래퍼 클래스로 변환

        // 박싱 (예제 작성)
        double dNum = 15.55;
        Double wrappedDnum = Double.valueOf(dNum); // dNum --> 박싱

        // 언박싱 (예제 작성) (래퍼 --> 기본)
        Double aDouble = Double.valueOf(20.0);
        double dNum2 = aDouble.doubleValue(); // 박싱(20.0) ---> 기본 데이터 변환 -> 언 박싱
        System.out.println("dNum2 : " + dNum2);

        // 자동 박싱과, 자동 언박싱 코드를 작성하시오
        Double autoDouble = 12.0; // 자동 박싱
        double autoUnBouble = autoDouble; // 자동 언박싱

    } // end of main
}
