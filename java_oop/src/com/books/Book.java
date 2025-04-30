package com.books;

/**
 * 도서를 저장하고 관리할 수 있는 간단한 프로그램 만들어 보기
 * C R U D
 */
public class Book {

    private String title;
    private String author;
    private int totalPage;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int totalPage) {
        this(title, author);
        this.totalPage = totalPage;
    }

    // getter
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getTotalPage() {
        return  totalPage;
    }

    // setter
    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo() {
        System.out.println(">> 책 정보 <<");
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("총 페이지 수 : " + totalPage);
    }

}
