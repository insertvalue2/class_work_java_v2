package com.startcraft_v04;

public abstract class Unit {

    protected String name;
    protected int power;
    protected int hp;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Unit unit) {
        unit.beAttacked(this.power);
        System.out.println(name + " 이 " + unit.getName() + "을 공격합니다 " );
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
        System.out.println(" 이름 : " + name);
        System.out.println(" 공격력 : " + power);
        System.out.println(" 체력 : " + hp);
    }

}
