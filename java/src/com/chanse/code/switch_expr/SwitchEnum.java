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

        switchEnum4(green);
        switchEnum5(green);
        switchEnum6(green);
        switchEnum7(green);
        switchEnum8(green);
        switchEnum9(green);
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

    private static void switchEnum4(Colour colour) {
        switch (colour) {
            case RED -> System.out.println("red");
            case GREEN -> System.out.println("green");
            case BLUE -> System.out.println("blue");
        }
    }

    private static void switchEnum5(Colour colour) {
        switch (colour) {
            case RED, GREEN -> System.out.println("red or green");
            case BLUE -> System.out.println("blue");
        };
    }

    private static void switchEnum6(Colour colour) {
        var result = switch (colour) {
            case RED -> 3;
            case GREEN -> 5;
            case BLUE -> 4;
        };
        System.out.println("Length of Color - " + result);
    }

    private static void switchEnum7(Colour colour) {
        int result = -1;
        switch (colour) {
            case RED:
                result = 3;
                break;
            case GREEN:
                result = 5;
                break;
            case BLUE:
                result = 4;
                break;
        }
        System.out.println("Length of Color - " + result);
    }

    private static void switchEnum8(Colour colour) {
        var result = switch (colour) {
            case RED -> {
                System.out.println("red");
                yield 3;
            }
            case GREEN -> {
                yield 5;
            }
            case BLUE -> 4;
        };
        System.out.println("Length of Color - " + result);
    }

    private static void switchEnum9(Colour colour) {
        var result = switch (colour) {
            case RED:
                System.out.println("red");
                yield 3;
            case GREEN:
                yield 5;
            case BLUE:
                yield 4;
        };
        System.out.println("Length of Color - " + result);
    }
}
