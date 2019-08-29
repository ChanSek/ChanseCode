package com.chanse.code.switch_expr;

public class SwitchString {

    public static void main(String[] args) {
        var colour = "red";
        switchColours(colour);
        System.out.println(monthLength("February"));
    }

    private static void switchColours(String colour) {
        switch (colour) {
            case "red":
                System.out.println("RED");
            case "green":
                System.out.println("GREEN");
                break;
            case "blue":
                System.out.println("BLUE");
                break;
        }
    }

    private static int monthLength(String monthName) {
        int monthLen = -1;
        switch (monthName) {
            case "May":
                monthLen = 3;
                break;
            case "June":
            case "July":
                monthLen = 4;
                break;
            case "March":
            case "April":
                monthLen = 5;
                break;
            case "August":
                monthLen = 6;
                break;
            case "January":
            case "October":
                monthLen = 7;
                break;
            case "February":
            case "November":
            case "December":
                monthLen = 8;
                break;
            case "September":
                monthLen = 9;
                break;
        }
        return monthLen;
    }
}
