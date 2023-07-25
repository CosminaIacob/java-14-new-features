package com.example.java14.switchFeature;

import java.util.Locale;

public class OldStyleSwitchStatement {

    public static void main(String[] args) {
        String food = "cheese";

        Locale locale;
        switch (food) {
            case "burger":
            case "donut":
                locale = Locale.US;
                break;
            case "cheese":
                locale = Locale.forLanguageTag("nl");
                break;
            case "maple syrup":
                locale = Locale.CANADA;
                break;
            default:
                locale = Locale.getDefault();
        }

        System.out.println(locale);
    }
}
