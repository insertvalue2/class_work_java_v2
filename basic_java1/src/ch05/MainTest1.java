package ch05;

public class MainTest1 {

    // 코드의 진입점 (메임 함수)
    public static void main(String[] args) {

        // JVM 가상 메모리 공간 존재한다.
        // 1. JVM Stack 메모리 공간 있다.
        // 2. Heap 동적 메모리 공간 있다.

        // heap 동적 메모리 공간에 있다.
        Book bookBox1 = new Book();
        // Stack 메모리 공간에 존재 한다.
        int n1 = 10;

    }

}
