package inner;

/**
 * 정적 내부 클래스(Static inner Class)
 */
public class Spaceship {

    private Engine innerEngine;

    // 우주선에 엔진 추가
    public void addEngine(Engine engine) {
        innerEngine = engine;
    }
    
    public void startSpaceShip() {
        if(innerEngine == null) {
            System.out.println("엔진을 먼저 장착해주세요");
        } else {
            System.out.println("달나랄로 출발합니다 슈융~~~");
        }
    }

    // 정적 내부 클래스
    public static class Engine {

        public static int ENGINE_COUNT = 0;
        private int serialNumber;

        public Engine() {
            ENGINE_COUNT++;
            this.serialNumber = ENGINE_COUNT;
        }

        public void start() {
            System.out.println("Engine " + serialNumber + " 동작 합니다 부릉~~~~");
        }

    }// end of inner Engine

}
