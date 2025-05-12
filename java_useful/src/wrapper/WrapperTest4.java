package wrapper;

public class WrapperTest4 {

    public static void main(String[] args) {
        // 기본 타입(int, double, boolean) ---> 문자열로 변화는 방법
        // 1. 가장 쉬운 방법
        System.out.println(10 + "");
        String str1 =  15.5 + "";

        // 2. String 클래스의 valueOf() 활용하는 방법
        int value = 5000;
        String strValue = String.valueOf(value); // value(int) --> String 변환
        System.out.println("정수를 문자열로 : " + strValue + " 원");

        Float value2 = 500.123F; // 접미사
        Long value3 = 1000L; // 접미사
        // 정수값 기본연산 -> int
        // 실수값 기본연산 -> double

        String strvalue2 =  String.valueOf(value2);
        System.out.println("strValue2 : " + strvalue2);

    } // end of main
}
