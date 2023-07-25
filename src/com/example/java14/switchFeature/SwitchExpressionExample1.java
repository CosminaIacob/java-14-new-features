package com.example.java14.switchFeature;

import java.util.Locale;

public class SwitchExpressionExample1 {

    public static void main(String[] args) {
        String food = "cheese";

        Locale locale = switch (food) {
            case "burger":
            case "donut":
                yield Locale.US;
            case "cheese":
                yield Locale.forLanguageTag("nl");
            case "maple syrup":
                yield Locale.CANADA;
            default:
                yield Locale.getDefault();
        };

        System.out.println(locale);
    }
}
