package com.chanse.code.switch_expr;

public class SwitchEnum {

    enum Colour {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        var red = Colour.RED;
        switchEnum(red);

        var green = Colour.GREEN;
        switchEnum2(green);

        var blue = Colour.BLUE;
        switchEnum3(blue);
    }

    private static void switchEnum(Colour value) {
        switch (value) {
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
        }
    }

    private static void switchEnum2(Colour value) {
        switch (value) {
            case GREEN:
                System.out.println("Green");
                break;
            case RED:
                System.out.println("Red");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
        }
    }

    private static void switchEnum3(Colour value) {
        switch (value) {
            case GREEN:
            case BLUE:
                System.out.println("Green or Blue");
                break;
            case RED:
                System.out.println("Red");
                break;
            default:
                throw new AssertionError("Wrong value");
        }
    }
}
