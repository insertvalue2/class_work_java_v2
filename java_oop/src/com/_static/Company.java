package com._static;

public class Company {

    // static 변수는 클래스 변수 라고도 한다.

    static int empSerialNumber = 1;

    // main 함수
    public static void main(String[] args) {
    
        Employee employee1 = new Employee("야스오");
        Employee employee2 = new Employee("티모");
        Employee employee3 = new Employee("샤코");
        Employee employee4 = new Employee("홍길동");

        System.out.println("야스오: " + employee1.getEmployeeId());
        System.out.println("티모: " + employee2.getEmployeeId());
        System.out.println("샤코: " + employee3.getEmployeeId());
        System.out.println("홍길동: " + employee4.getEmployeeId());

    } // end of main 

}
