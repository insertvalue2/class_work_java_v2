package ch02;

/**
 * 문자 데이터 타입
 * char 자료형에 크기는 2btye; 16비트
 */
public class DataType2 {

    public static void main(String[] args) {

        // 단 하나의 문자를 저장하기 위해 사용할 수 있다.


        char charBox;
        charBox = 'A';   // '가' -> 문자타입,   "가나다" -> 문자열
        System.out.println(charBox);

        char alphabetA = 'A';
        char alphabetB = 'B';
        char alphabetBox = alphabetA;
        System.out.println(alphabetBox);

        // 더 많은 글자를 담고 싶으면 문자열을 사용하면 된다.
        String temp = "안녕반가워";
        System.out.println(temp);


    } // end of main
}
