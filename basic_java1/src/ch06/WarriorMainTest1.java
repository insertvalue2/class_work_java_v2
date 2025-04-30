package ch06;

public class WarriorMainTest1 {

    // 코드를 실행 하는 측
    public static void main(String[] args) {
       // 메인 지역
       // 지역 변수
       int a = 10;

       Warrior w1 = new Warrior();
       w1.name = "아마데우스";
       w1.hp = 100;
       w1.power = 30;
       w1.dp = 10;
       w1.color = "빨간색";

        // w1 주소값을 화면에 객체에 정보를 출력 하자.
        System.out.println(w1.color);
        System.out.println(w1.name);

        System.out.println("--------------");

        Warrior w2 = new Warrior();
        System.out.println(w2.hp);
        System.out.println(w2.weight);
        System.out.println(w2.isDie);
        // null 값이 없다
        System.out.println(w2.name);

        Warrior w3 = new Warrior();

    } // end of main

} // end of class
