package collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {

    public static void main(String[] args) {

        List mList; // 리스트 인터페이스 (계열)

        int[] arrayInt = new int[10];
        ArrayList<Integer> list = new ArrayList();
        // <T> <- 제네릭 추후 배워야 할 내용
        // Integer(참조타입), int(기본데이터 타입)
        // Integer - wrap 클래스 int 기본 데이터 타입을 클래스로 설계해 둔 데이터 타입이다.

        // ArrayList<Integer> list -> 정수값을 하나의 변수에 저장하는 리스트 계열에 자료구조를 생성.

        // 1. 값을 추가 하는 방법
        // arrayInt[0] = 100;
        list.add(100);
        list.add(null); // [100][null]
        list.add(200);
        // 2. 값 꺼내기
        // System.out.println(arrayInt[0]);
        System.out.println(list.get(0));

        // 3. 값 삭제하기
        list.remove(1);
        // 3.1 _ 삭제후에 전체 출력 하기
        System.out.println(list.toString());

        // 4. 인덱스 번호로 지정해서 값 추가 하기
        list.add(1, 1000);
        System.out.println("출력 확인1 : " + list);

        // 4.1 삭제 처리 해야 함
        list.remove(2); // 인덱스 번호로 삭제
        // Object 값으로도 삭제 할 수 있다.
        System.out.println("출력 확인2 : " + list);

        // 5. 전체 삭제
        list.clear();
        System.out.println("출력 확인3 : " + list);

        // 6. 리스트의 사이즈를 확인
        // arrayInt.length;
        System.out.println("사이즈 확인 : " + list.size());


        // nums 참조 변수에 list 참조 변수에 주소값을 대입 시켰다.
        System.out.println("-----------------------");
        System.out.println("list : " + list);

        ArrayList nums = list;
        // ArrayList nums = new ArrayList();
        System.out.println("새로 선언한 nums 에 값을 추가 했다.");
        nums.add(10);
        nums.add(500);
        // nums 라는 변수로 접근해서 add() 를 했는데 왜 다시 list 출력하면 데이터가 존재 하고 있지??
        System.out.println("list : " + list);
        System.out.println("nums : " + nums);

        System.out.println("리스트 값 존재 여부 확인 : " + nums.contains(10));
        System.out.println("리스트의 요소의 위치(index) 확인 : " + nums.indexOf(500));

        for(int i = 0; i < nums.size(); i++) {
            // nums[i] <-- 배열 방식
            System.out.println(nums.get(i));
        }

    } // end of main
} // end of class
