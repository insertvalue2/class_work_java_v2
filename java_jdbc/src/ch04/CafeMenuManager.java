package ch04;

import java.sql.*;
import java.util.Scanner;

/**
 *  JDBC 연습, 메서드 분리 하는 방법, 활용
 */
public class CafeMenuManager {

    // MySQL 서버 접근 하기 위해 - 주소,계정,비밀번호
    private static final String URL = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
    private static final String USER = "root";
    private static final String PWD = "asd1234";


    // 메뉴 추가 static 메서드
    public static void insertMenu(String name, int price, String category) {
        // insert into menu(name, price, category) values ('아메리카노', 2000, '커피');
        try(Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
          String sql = "insert into menu(name, price, category) values (?, ?, ?) ";
          PreparedStatement pstmt = connection.prepareStatement(sql);
          pstmt.setString(1, name);
          pstmt.setInt(2, price);
          pstmt.setString(3, category);
          int rowsInsertedCount = pstmt.executeUpdate(); // 쿼리 실행(INSERT, UPDATE, DELETE)
          System.out.println(rowsInsertedCount + " 개의 메뉴가 추가 되었습니다.");
        } catch (Exception e) {
            System.err.println("메뉴 추가 중 오류 : " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 메뉴 가격 수정 기능
    // update menu set price = 3000 where name = "아메리카노";
    public static void updateMenuPrice(int price, String name) {
        try(Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "update menu set price = ? where name = ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, price);
            pstmt.setString(2, name);
            int rowsUpdatedCount = pstmt.executeUpdate();
            System.out.println(rowsUpdatedCount + " 개의 메뉴 가격이 수정되었습니다.");
        } catch (Exception e) {
            System.err.println("메뉴 가격 수정 중 오류 : " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 메뉴 삭제 기능
    public static void deleteMenu(String name) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "DELETE FROM menu WHERE name = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, name);
            int rowsDeleted = stmt.executeUpdate();
            System.out.println(rowsDeleted + "개의 메뉴가 삭제되었습니다.");
        } catch (SQLException e) {
            System.err.println("메뉴 삭제 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 모든 메뉴 조회 메서드
    public static void selectAllMenu() {
        // 1. 반드시 쿼리를 확인하고 복사 붙여 넣기
        // 2. 메서드의 파라미터 결정
        // 3. 필요한 코드를 구현 , 테스트 까지 (DB 에서도 확인)
        try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "SELECT * FROM menu";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            System.out.println("\n현재 메뉴 목록:");
            while (resultSet.next()) {
                System.out.println("[" + resultSet.getString("category") + "] " +
                        resultSet.getString("name") + " - " + resultSet.getInt("price") + "원");
            }
        } catch (SQLException e) {
            System.err.println("메뉴 조회 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }



    // 코드의 진입점
    public static void main(String[] args) {
        // insertMenu("커피", 2000, "커피류");
        // updateMenuPrice(3000, "커피");
        // selectAllMenu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\\n=== 카페 메뉴 관리 시스템 ===");
            System.out.println("1. 메뉴 추가");
            System.out.println("2. 메뉴 가격 수정");
            System.out.println("3. 메뉴 삭제");
            System.out.println("4. 메뉴 목록 조회");
            System.out.println("5. 종료");
            System.out.print("선택 (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            // switch 사용해서 동작 흐름 만들어 보기

        }


    } // end of main

}
