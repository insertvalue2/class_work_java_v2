package exception;

public class ThrowsHandling {

    public static void main(String[] args)  {

        Calc calc = new Calc();
//        try {
//            int result = calc.divide(10, 0);
//            System.out.println("result : " + result);
//        } catch (Exception e) {
//            System.out.println(e.getClass());
//            System.out.println("에러 발생");
//        }
        try {
            calc.divide(10, 0);
        } catch (Exception e) {
            System.out.println("인수로 0을 넣지 마세요");
            //throw new RuntimeException(e);
        }

    } // end of main

} // end of class


class Calc {
    // 예외 발생할 수 있는 코드에서 직접 예외처리를 할 수 있지만
    // 사용하는 시점(사용하는 사람이) 알아서 적절하게 예외처리를 던질 수 있다.
    public int divide(int n1, int n2) throws ArithmeticException, Exception {
        return n1 / n2;
    }

}

