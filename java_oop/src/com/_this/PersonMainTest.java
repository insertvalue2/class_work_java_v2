package com._this;

public class PersonMainTest {

    public static void main(String[] args) {

       //  Person p1 = new Person("홍길동", 10, "010-1234-1234");
        Person p1 = new Person("홍길동", 10, "010-1234-1234", "F");

        // 결과 값 --> return this --> com._thisPer@ajddfj
        System.out.println(p1.getPerson());
    }
}
