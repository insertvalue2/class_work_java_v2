package generic;

public class MainTest1 {

    public static void main(String[] args) {

        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        ThreeDPrinter1 dPrinter1 = new ThreeDPrinter1();
        // 재료를 주입 해주어여 한다.
        dPrinter1.setMaterial(plastic1);

        // 위 코드의 한계는 재료가 만약 플라스틱에서 파우더로 변경해야 한다면
        // 재료가 플라스틱에 종속되어 있기 때문에 ThreeDPrinter2 처럼 새로운
        // 클래스를 생성하거나 코드를 수정해야하는 번거로움이 발생한다.
        ThreeDPrinter2 threeDPrinter2 = new ThreeDPrinter2();
        threeDPrinter2.setMaterial(powder1);

        System.out.println("--------------------------------");

        ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();
        threeDPrinter3.setMaterial(plastic1);
        // 재료 꺼내기
        Plastic usePlastic = (Plastic) threeDPrinter3.getMaterial();
        System.out.println(usePlastic.toString());
        // 재료 교체 파우더로
        threeDPrinter3.setMaterial(powder1);
        Powder usePowder = (Powder) threeDPrinter3.getMaterial();
        System.out.println(usePowder.toString());
        // Object 타입으로 설계하면 모든 데이터 타입을 담을 수 있지만
        // 사용하는 측에서 매번 원시코드 확인해 가면서 불편하는 부분이 발생할 수 있다.

    } // end of main

} // end of class
