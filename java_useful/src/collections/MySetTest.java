package collections;

import java.util.*;

public class MySetTest {

    public static void main(String[] args) {

        // 계층 구조 확인 (업캐스팅된 상태)
        Set<Integer> mTestSet = new HashSet<>();

        // 사용방법
        // HashSet : 중복된 요소를 허용하지 않고, 순서가 없는 자료 구조
        HashSet<Integer> numberSet = new HashSet<>();

        // 요소 추가하기
        numberSet.add(500);
        numberSet.add(11); // 중복 값, 추가되지 않음
        numberSet.add(200);
        numberSet.add(33);
        numberSet.add(355); // 중복 값, 추가 되지 않음
        System.out.println("numberSet의 크기 : " + numberSet.size());

        // 요소 제거
        numberSet.remove(1); // remove 할 때 없는 요소를 선택하더라도 오류는 발생하지 않음
        System.out.println("numberSet의 크기 : " + numberSet.size());

        // 자료구조는 반복문과 함께 많이 사용이 된다.
        // for (int i = 0; i < 10; i++) { } - 인덱스 for 구문은 사용 불가

        // 향상된 for 구문으로 set 계열의 데이터를 순회 시킬 수 있다.
        for(Integer num : numberSet) {
            System.out.println("num 값 확인 : " + num);
        }

        // Set 계열을 Iterator 타입으로 변환해서 순회 시킬 수 있었다. 지금도 가능
        System.out.println("--------------------------------------------");
        Iterator<Integer> iter = numberSet.iterator(); // 형 변환 처리 Set --> Iterator 형 변환
        while(iter.hasNext()) {
            System.out.println("값 : " + iter.next()); // next() 요소를 반환 처리 한다.
        }

        System.out.println("----------------------");
        // Set계열 자료 구조 선언 (정수값만 담을 수 있고 중복 허용 불가)
        HashSet<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6) {
            lottoNumbers.add(getRandomNumber());
        }
        System.out.println("무작위로 선택된 로또 번호 6개 : " + lottoNumbers.toString());

        // HashSet 데이터 타입을 ArrayList 객체 생성시에 즉, 생성자에 인자값을 넣을 수 있도록 설계 됨
        ArrayList<Integer> sortedList = new ArrayList<>(lottoNumbers);
        // 정렬하기 기능 사용해보기
        Collections.sort(sortedList);
        System.out.println("정렬된 로또 번호 확인 : " + sortedList);

    } // end of main

    // 무작위 1 부터 45 까지 랜덤 번호 생성 함수
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(45) + 1;
    }

} // end of class
