package com._interface;

// 인터페이스는 구현받다, 구현하다.
// Animal 인터페이스를 구현받다.
public class Dog implements Animal {
     // 문법
    // 추상 메서드를 구현 메서드로 재정의 해야 합니다.

    @Override
    public void eat() {
        System.out.println("강아지가 먹이를 먹습니다.");
    }

    @Override
    public void move() {
        System.out.println("강아지 달린다");
    }

    public static void main(String[] args) {

        // 다형성
        Animal dog = new Dog(); // 업캐스팅
        Animal bird = new Bird();

        dog.eat();
        dog.move();
        bird.eat();
        bird.move();

    } // end of main
}


class Bird implements Animal {

    @Override
    public void eat() {
        System.out.println("새가 모이를 먹습니다");
    }

    @Override
    public void move() {
        System.out.println("새가 하늘을 날아 다닙니다");
    }
}

