package ch08;

public class Dog {

    String name;

    // 개발자 생성자를 직접 만들지 않았다면
    // 컴파일러가 자동으로 기본 생성자를 추가해 준다.

    // 사용자 정의 생성자
    public Dog(String s) {
        name = s;
        // 중요!!
        // 생성자는 객체가 만들어질 때 제일 먼저 수행하는 코드가 된다.
    }

}
