package com.chanse.code.switch_expr;

public class SwitchWithoutBreak {

    public static void main(String[] args) {
        var x = 3;
        noBreak(x);
    }

    private static void noBreak(int x) {
        switch (x) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            case 4:
                System.out.println("Four");
            case 5:
                System.out.println("Five");
        }
    }
}
