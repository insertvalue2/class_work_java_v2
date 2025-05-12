package generic.ch04;

public class GenericBoxDemo {

    public static void main(String[] args) {
        // String 타입에 Box 선언 및 사용..
        Box<String> stringBox = new Box<>("box");

        // Integer 타입에 Box 선언 및 사용
        Box<Integer> integerBox = new Box<>(100);

        // double --> 래퍼클래스 ---> Double 타입에 Box 선언 및 사용
        Box<Double> doubleBox = new Box<>(3.14);

    } // end of main
}
