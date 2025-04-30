package _string;

import _object.Book;

public class StringTest2 {

    public static void main(String[] args) {

        // 스트링 객체는 불변이다.
        String str1 = new String("Hello");
        String str2 = new String("World");

        // 원래 객체 주소가 생성 되어있고 내부 변수 값이 변경이 된다면
        // String 클래는 수정되지 않고 불변이다.
        // 즉 수정이 되면다면 새로운 String 객체를 만드는 동작으로 실행된다.

        System.out.println("고유 주소 확인 : " + System.identityHashCode(str1));
        // 문자열 연결 기능 호출해 보기
        str1 = str1.concat(str2);
        System.out.println("수정 이후 고유 주소 확인 : " + System.identityHashCode(str1));
    }

}
