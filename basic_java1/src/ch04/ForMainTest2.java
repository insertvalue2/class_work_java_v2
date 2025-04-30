package ch04;

public class ForMainTest2 {

    public static void main(String[] args) {

        // 2 * 1 = 2
        // 2 * 2 = 4
        // 2 * 3 = 6
        // ...
        // 2 * 9 = 18
        // 화면에 구구단 2단에 모양을 출력하시오.
        // 1. 변수에 활용(효용)
        int num = 2;
        System.out.println( num +  " * 1 = " + (num * 1));
        System.out.println( num +  " * 2 = " + (num * 2));
        System.out.println( num +  " * 3 = " + (num * 3));
        System.out.println( num +  " * 4 = " + (num * 4));
        System.out.println( num +  " * 5 = " + (num * 5));
        System.out.println( num +  " * 6 = " + (num * 6));
        System.out.println( num +  " * 7 = " + (num * 7));
        System.out.println( num +  " * 8 = " + (num * 8));
        System.out.println( num +  " * 9 = " + (num * 9));
        System.out.println("----------------------------------");

        // 화면에 3단을 출력하시오.
        num = 3;
        System.out.println( num +  " * 1 = " + (num * 1));
        System.out.println( num +  " * 2 = " + (num * 2));
        System.out.println( num +  " * 3 = " + (num * 3));
        System.out.println( num +  " * 4 = " + (num * 4));
        System.out.println( num +  " * 5 = " + (num * 5));
        System.out.println( num +  " * 6 = " + (num * 6));
        System.out.println( num +  " * 7 = " + (num * 7));
        System.out.println( num +  " * 8 = " + (num * 8));
        System.out.println( num +  " * 9 = " + (num * 9));
        System.out.println("----------------------------------");
        // 4단을 화면에 출력 하시오.
        num = 4;
        System.out.println( num +  " * 1 = " + (num * 1));
        System.out.println( num +  " * 2 = " + (num * 2));
        System.out.println( num +  " * 3 = " + (num * 3));
        System.out.println( num +  " * 4 = " + (num * 4));
        System.out.println( num +  " * 5 = " + (num * 5));
        System.out.println( num +  " * 6 = " + (num * 6));
        System.out.println( num +  " * 7 = " + (num * 7));
        System.out.println( num +  " * 8 = " + (num * 8));
        System.out.println( num +  " * 9 = " + (num * 9));
        System.out.println("---------------------------------");
        // 5단을 출력하시오
        // 0 , 1 , 2 , 3, 4, 5, 6, 7, 8
        num = 5;
        for(int i = 1; i < 10; i++) {
            System.out.println( num +  " * "+ i +" = " + (num * i));
        } // end of for

        // 6단 for 구문으로 출력

        // 7단 for 구문으로 출력

        // 8단 for 구문으로 출력

        // 9단 for 구문으로 출력



    } // end of main

} // end of class
