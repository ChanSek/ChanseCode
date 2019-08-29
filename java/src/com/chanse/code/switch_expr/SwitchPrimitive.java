package com.chanse.code.switch_expr;

public class SwitchPrimitive {

    public static void main(String[] args) {
        var x = 3;
        byte b = 10;
        short sh = 100;
        String s = "test";
        switchInt(x);
        switchChar('d');
        switchByte(b);
        switchShort(sh);
    }

    private static void switchInt(int value) {
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
    }

    private static void switchChar(char value) {
        switch (value) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            default:
                System.out.println("Other");
        }
    }

    private static void switchShort(short value) {
        switch (value) {
            case 100:
                System.out.println("One Hundred");
                break;
            case 200:
                System.out.println("Two Hundred");
                break;
            case 300:
                System.out.println("Three Hundred");
                break;
        }
    }

    private static void switchByte(byte value) {
        switch (value) {
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            case 30:
                System.out.println("Thirty");
                break;
        }
    }
}
