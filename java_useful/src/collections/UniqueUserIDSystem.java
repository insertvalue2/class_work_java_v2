package collections;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

    // 상황 -> 사용자가 키보드로 입력한 ID 데이터를 많이 저장해야 한다.
    // 고유한 값이여야 한다. 메모리상으로 관리할 예정
    private HashSet<String> registeredIDs;

    public UniqueUserIDSystem() {
        registeredIDs = new HashSet<>();

        // printAllIDs 메서드를 테스트 하기 위해서 샘플 데이터 입력해 보기
        // 샘플 데이터 입력 - 추후 삭제 예정
        registeredIDs.add("홍길동");
        registeredIDs.add("이순신");
        registeredIDs.add("야스오");
    }

    // 사용자 ID를 등록하는 메서드
    public boolean addUserId(String userId) {
        return registeredIDs.add(userId);
    }

    // 사용자 ID를 출력하는 메서드를 직접 만들어 보자. - 전체 출력
    // 메서드 이름을 동사로 시작하는 것이 권장사항 이다.
    public void printAllIDs() {
        // registeredIDs 순회해서 콘솔창에 출력 하고자 한다.
        // 초기화 for 구문, Iterator 로 형변환해서 순회를 시킬 수 있다.
        // HashSet 안에 요소가 아무 것도 없다면
        if (registeredIDs.isEmpty()) {
            System.out.println("등록된 사용자 ID가 없습니다");
            return;
        }
        // Iterator 로 형변환 해서도 사용 가능
        for (String id : registeredIDs) {
            System.out.println("id : " + id);
        }
        System.out.println("총 등록된 ID 개수 : " + registeredIDs.size());
    }

    // 시스템을 실행할 메서드
    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("사용하고 싶은 ID를 입력하세요 종료하려면 'exit' 입력");
            String input = scanner.nextLine().trim(); // .trim() 공백 제거 

            // 사용자가 키보드에서 값을 넣지 않고 바로 엔터를 누르는 경우 
            // 빈 입력 처리 
            if (input.isEmpty()) {
                System.out.println("ID를 입력해주세요");
                continue;
            }

            if ("exit".equals(input)) {
                System.out.println("시스템을 종료 합니다.");
                break;
            }

            boolean isRegistered = addUserId(input);
            if (isRegistered) {
                System.out.println("새로운 사용자 ID가 등록되었습니다");
            } else {
                System.out.println("이미 등록된 사용자 ID 입니다.");
            }

        } // end of while
        scanner.close(); // 자원 해제
    } // end of start()

    // 메인 함수
    public static void main(String[] args) {
        UniqueUserIDSystem idSystem = new UniqueUserIDSystem();
        // idSystem.start();
        // idSystem.printAllIDs(); //
    }

}  // end of class
