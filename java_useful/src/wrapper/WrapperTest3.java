package wrapper;

public class WrapperTest3 {

    public static void main(String[] args) {
        // ** 래퍼 클래스의 활용 **
        // String ---> 기본 데이터 타입(int, double, boolean)

        String strNum = "123";
        String strDouble = "45.67";
        String strBool = "true";
        String badStr = "a123";

        // 래퍼 클래스를 활용해서 형 변환 처리
        int num = Integer.parseInt(strNum);
        System.out.println(num);

        double dNum = Double.parseDouble(strDouble);
        System.out.println(dNum);

        boolean boolNum = Boolean.parseBoolean(strBool);
        System.out.println(boolNum);

        // 주의 사항
        // a123 --> int 변환
        try {
            int intNum = Integer.parseInt(badStr);
        } catch (NumberFormatException e) {
            System.out.println( badStr + " 을 정수값으로 변경할 수 없습니다." );
        }

        // 가능한 String --> 기본 데이터 타입으로 변환을 할 때 예외처리 코드를
        // 작성해 주는 것이 좋다.


    } // end of main

}
