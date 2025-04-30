package com.polymorphism;

public class EMart {

    public static void main(String[] args) {

        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        // 배열
        // 배열을 사용할 때는 반드시 크기를 먼저 지정해야 한다.
        // 배열에 길이과 요소에 길이(크기) 는 항상 동일한 것은 아니다.
        Banana[] bananas = new Banana[10];
        bananas[0] = banana1;
        bananas[1] = banana2;

        Peach[] peaches = new Peach[3];
        peaches[0] = new Peach();
        peaches[1] = new Peach();

        System.out.println("----------------------");
        // 다형성 --> 유연한 코드를 작성할 수 있다.

        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Peach();


        // 도전 문제
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i] != null) {
                fruits[i].showInfo();
                // 만약 바나나 타입 이라면
                if(fruits[i] instanceof Banana) {
                    // ((Banana)fruits[i]) 다운 캐스팅
                    String origin = ((Banana)fruits[i]).origin;
                    System.out.println("origin : " + origin);
                    ((Banana)fruits[i]).saleBanana();
                }
            }

        }
        // 코드 실행시 오류가 발생 되면 안됩니다.













    } // end of main

} // end of class
