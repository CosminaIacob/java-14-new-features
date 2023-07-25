package com.example.java14.switchFeature;

import java.util.Locale;

public class SwitchExpressionExample3 {

    public static void main(String[] args) {
        String food = "cheese";

        Locale locale = switch (food) {
            case "burger", "donut" -> Locale.US;
            case "cheese" -> Locale.forLanguageTag("nl");
            case "maple syrup" -> Locale.CANADA;
            default -> Locale.getDefault();
        };

        System.out.println(locale);
    }
}
