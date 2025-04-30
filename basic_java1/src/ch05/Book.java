package ch05;

// 책이라는 설계로를 구성해보자.
// 컴파일 시점:  코드를 작성하는 시점
// 런타임 시점 : java 명령어를 통해 프로그램이 실행하는 시점
public class Book {
    // 속성 만들기
    String title;
    String author;
    int totalPages;
    int publishYear;

    // 메서드 만들기
    public void showInfo() {
        System.out.println("--------상태창----------");
    }
}
