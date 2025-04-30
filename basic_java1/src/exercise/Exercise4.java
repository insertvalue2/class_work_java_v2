package exercise;

public class Exercise4 {

    public static void main(String[] args) {

        // 59.99  -> 70% 가격
        // 30% 할인된 가격을 출력 하시오

        // 상수 선언
        final double ORIGINAL_PRICE = 59.99;
        final double DISCOUNT_RATE = 0.30; // 30% -> 퍼센트 100분의 --> 30 / 100 -> 0.30
        // 할인된 가격 = 원가 × (1 − 할인율)
        //                                       1 - 0.30 -> 0.70
        double discountPrice = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);
        System.out.println(discountPrice);
        // 최종 가격을 정수로 형 변환(강제 형 변환)
        int finalPrice = (int) discountPrice;
        System.out.println("최종 할인 가격 : " + finalPrice);

    } // end of main

} // end of class
