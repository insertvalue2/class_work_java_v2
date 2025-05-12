package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        // 계층 구조 확인
        Map<String, String> map;

        // Map 계열 자료 구조 객체 선언과 동시에 초기화 
        Map<String, String> books = new HashMap<>();
        // C R U D

        // 데이터 추가
        books.put("해리포터", "J.K 롤링");
        books.put("반지의제왕", "J.R.R 톨킨");
        books.put("1984", "조지오웰");

        // 데이터 조회 : 특정 키 값으로 value를 읽어 보기
        String value1 = books.get("해리포터");
        System.out.println("value1 : " + value1);

        String value2 = books.get("해리포터222");
        System.out.println("value2 : " + value2); // 없는 키 값을 요청하면 null 값을 반환 한다.

        // 데이터 수정하기
        books.put("1984", "업데이트 됨");
        System.out.println(books.get("1984"));

        // 데이터 삭제하기
        books.remove("반지의제왕");
        // size() 확인
        System.out.println("Map size() 확인 : " + books.size());
        // 키값을 확인하는 메서드 제공 됨
        System.out.println("keySet() : " + books.keySet());
        System.out.println("--------------------------------------");
        // 향상된 for 구문
        for( String key : books.keySet()) {
            System.out.println("key 값 확인 : " + key);
            System.out.println("value 값 확인(key 활용) " + books.get(key));
        }

        // Iterator 를 사용해서 순회 시켜 보자.
        Iterator<Map.Entry<String, String>> iter = books.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }

        System.out.println("Map(books)의 크기를 반환 : " + books.size());
        // 전체 요소 삭제
        books.clear();

    } // end of main
}
