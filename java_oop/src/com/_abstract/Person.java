package com._abstract;

public class Person extends Human {

    // 구현 메서드로 만들어 주면 된다.
    @Override
    public void hunt() {
        System.out.println("총으로 동물들을 사냥합니다.");
    }
}
