package ch04;

public class ForMainTest4 {

    public static void main(String[] args) {

        // 1 부터 100까지 수 중에 홀 수에 총 합을 구하시오.
        // 1  + 3 +  5 .... 99 -> 총합: ??
        int sum = 0;
        int totalSum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                System.out.println("홀수 확인 : " + i);
                sum += i;
            }
            totalSum = totalSum + i;
        }
        System.out.println("총 합 : " + sum);
        System.out.println("짝수, 홀수 총 합 : " + totalSum);

        System.out.println("------------------------------");
        // 반복을 사용할 때 증감식에 꼭 1만 증가 시킬 수 있는 것은 아니다. (활용)
        // 2 4 6 8 .... 100 출력
        // 2씩증 시켜보자.
//        for(int i = 2; i <= 100; i = i + 2) {
//
//        }
        // 반복문 2씩 증가 시켜 보자.
        for(int i = 2; i <= 100; i += 2) {
            System.out.println("i : " + i);
        }
        // for 구문에 활용
        // 10 , 9 , 8 , 7 , 6 , 5, 4, 3, 2, 1 출력하시오
        // for 구문 10번 반복 (안에 내용을 좀 다름)
        for(int i = 10; i > 0; i--) {
            // 수행구문
            // 첫번째 반복 : 10
            // 두번째 반복 : 9
            System.out.println(i);
        }
    } // end of main
} // end of class
