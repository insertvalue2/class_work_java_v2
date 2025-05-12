package generic.ch03;


public class MainTest3 {

    public static void main(String[] args) {

        // 재료 선언해 보기
        Powder powder1 = new Powder();
        Plastic plastic1 = new Plastic();
        Water water1 = new Water();

        // 타입에 안정성과 <T extends Object> 타입에 제한을 둘 수 있다.
        GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
        genericPrinter1.setMaterial(powder1);

        // Water 를 사용해 보자.
        // 컴파일 시점에 오류 발생
        // GenericPrinter<Water> genericPrinter2 = new GenericPrinter<Water>();

    } // end of main
}
