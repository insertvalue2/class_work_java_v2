package com.association;

public class Course {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    // getter 메서드 만들기
    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("강의 : " + name);
    }

}
