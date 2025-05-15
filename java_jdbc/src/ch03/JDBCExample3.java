package ch03;

import java.sql.*;

public class JDBCExample3 {

    public static void main(String[] args) {

        // MySQL 서버 접근 하기 위해 - 주소,계정,비밀번호
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String pwd = "asd1234";

        // 자바 ----> MySQL 서버에 접근 하기 위한 준비물
        // JDBC 인터페이스를 보고 구현한 각 회사에 JDBC 구현 클래스들이 필요하다.
        // 해당 제품에 lib 를 다운로드 받아서 우리 프로젝트 연결 처리
        Connection con = null;
        // Statement --> 보안 성능 좋은 녀석 --> PreparedStatement
        // Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs  = null;


        try {
            // Driver 로드 (최근 작성할 필요 없음)
            //Class.forName("com.mysql.cj.jdbc.Driver");
            // 1. 데이터 베이스에 연결 요청
            con = DriverManager.getConnection(url, user, pwd);
            // 2. Statement 생성 해야 함 - (쿼리를 만들어서 실행하기 위해)
            // stmt = con.createStatement();
            // prepareStatement 생성 (미리 쿼리 구분을 함께 만들어 준다 - 일부분만)
            pstmt = con.prepareStatement("SELECT * FROM tb_student where no = ? and age = ? ");
            // pstmt.setInt(); ? 표 순서 기준으로 해당하는 데이터 타입을 명시하는 것
            pstmt.setString(1, "20170001");
            pstmt.setInt(2, 25);
            // 3. 쿼리를 만들고 실행 요청해야 한다. --> 수행후 ResultSet 객체 생성 됨
            //rs = stmt.executeQuery("SELECT * FROM tb_student WHERE no = 1234");
            // 쿼리 실행
            rs = pstmt.executeQuery();
            // 4. 결과 (응용해서 프로그래밍 처리)
            // 결과 추출하는 기법 (Set 자료구조에서)
            while (rs.next()) {
                String no = rs.getString("no");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("no : " + no + ", name : " + name + ", age : " + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(con != null) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    } // end of main
}
