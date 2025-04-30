package inner;

/**
 * 지역 내부 클래스 (Local Inner Class)
 * 메서드 안에 클래스가 있는 형태..
 */
public class OuterClass2 {

    public void display() {

        // 지역 내부 클래스 선언
        class LocalInnerClass {
            void printMessage() {
                System.out.println("안녕 나는 지역 내부 클래스 메서드야 ~");
            }
        }

        // LocalInnerClass 생성
        LocalInnerClass inner = new LocalInnerClass();
        inner.printMessage();

    } // end of method - display()

    public static void main(String[] args) {

        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.display();

    } // end of main

}

