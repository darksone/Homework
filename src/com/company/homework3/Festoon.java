package com.company.homework3;

public class Festoon {
    public static void main(String[] args) {
        String values = "TurnOn";
        switch (values) {
            case "RunningLine":
                runLine();
                break;
            case "FewTimes":
                blinkLineFewTimes();
                break;
            case "TurnOn":
                turnOn();
                break;
            case "ShowConditionFestoon":
                showCondition();
                break;
            default:
                doDefault();
        }
    }

    private static void blinkLineFewTimes() {
        int b = 560;
        for (int n = 0; n <= 4; n++) {
            System.out.println(Integer.toBinaryString(b));
        }
    }

    private static void runLine() {
        int a = -560;
        for (int n = 1; n <= 5; n++) {
            a = a >> 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }

    private static void turnOn() {
        int message1 = 560;
        int maska = 41;
        int codedMessage = message1 & maska;
        int receivedMessage = codedMessage & maska;

        if (receivedMessage > 0) {
            System.out.println("First position is on");
        } else {
            System.out.println("First position is off");
        }
    }

    private static void showCondition() {
        int a = 560;
        System.out.println(Integer.toBinaryString(a));
    }

    private static void doDefault() {
        System.out.println("Error.Check your code.");
    }
}

