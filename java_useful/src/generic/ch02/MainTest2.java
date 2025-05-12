package generic.ch02;

public class MainTest2 {

    public static void main(String[] args) {

        // 재료 선언
        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        // 사용하는 시점에 T 대신 어떤 자료형을 사용할지 지정해 주면 된다.
        GenericPrinter<Plastic> genericPrinter1 = new GenericPrinter<>();
        genericPrinter1.setMaterial(plastic1);
        System.out.println(genericPrinter1.toString());
        // 재료 꺼내기
        Plastic usePlastic = genericPrinter1.getMaterial(); // 형 변환이 필요 없다.

        // 컴파일 시점에 오류를 알려줘 안정적인 코드 작업을 수행할 수 있다.
        // Powder usePowder = genericPrinter1.getMaterial();

        Water water1 = new Water();
        GenericPrinter<Water> genericPrinter2 = new GenericPrinter<>();
        genericPrinter2.setMaterial(water1);
        System.out.println(genericPrinter2.toString());

    } // end of main
}
