package com.chanse.code.switch_expr;

public class SkippedSwitch {

    public static void main(String[] args) {
        var x = 3;
        switchIntSkipped(x);
        switchIntSkipped2(x);
        switchIntSkipped3(x);
    }

    private static void switchIntSkipped(int value) {
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
        }
    }

    private static void switchIntSkipped2(int value) {
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
        }
    }

    private static void switchIntSkipped3(int value) {
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("Five");
                break;
        }
    }
}
