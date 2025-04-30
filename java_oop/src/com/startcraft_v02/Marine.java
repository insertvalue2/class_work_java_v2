package com.startcraft_v02;


/**
 * ver02
 * 메서드 오버로딩 기법을 적용해서 코드를 설계해 보자.
 */
// 클래스 측, 실행 측
public class Marine {

    private String name;
    private int power;
    private int hp;

    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
    }

    // read only --> getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Zealot zealot) {
        zealot.beAttacked(this.power);
        System.out.println(name + " 이 "+ zealot.getName() +"을 공격합니다 " );
    }

    public void attack(Zergling zergling) {
        zergling.beAttacked(this.power);
        System.out.println(name + " 이 " + zergling.getName() + "을 공격합니다 " );
    }

    public void beAttacked(int power) {
        if(this.hp <= 0 ) {
            System.out.println(name + " 이(가) 이미 사망하였습니다.");
            // 실행에 제어권을 반납하고 싶으면 키워드 !! (돌아가)
            return;
        }
        this.hp -= power;
        System.out.println(name + "이(가) 공격을 당합니다");
    }

    public void showInfo() {
        System.out.println("---------⭐상태창⭐----------");
        System.out.println("마린 이름 : " + name);
        System.out.println("마린 공격력 : " + power);
        System.out.println("마린 체력 : " + hp);
    }


} // end of class
