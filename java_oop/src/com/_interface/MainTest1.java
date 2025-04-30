package com._interface;

public class MainTest1 {

    public static void main(String[] args) {

        // 인터페이스는 유연한 코드를 설계 할 수 있다.
        RemoteController[] remoteControllers = new RemoteController[3];
        remoteControllers[0] = new Television();
        remoteControllers[1] = new Refrigerator();
        remoteControllers[2] = new ToyRobot();

        // 인터페이스 표준이다, 강제성이 있는 규약
        for(int i = 0; i < remoteControllers.length; i++) {
            remoteControllers[i].turnOn();
        }

    }
}
