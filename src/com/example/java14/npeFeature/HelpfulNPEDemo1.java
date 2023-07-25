package com.example.java14.npeFeature;

public class HelpfulNPEDemo1 {

    static Object myObject = null;

    public static void main(String... args) {
        myObject.toString().hashCode();
    }

//    javac com.example.java14.npeFeature.HelpfulNPEDemo1.java
//    java -XX:+ShowCodedetilsInExceptionsMessages com.example.java14.npeFeature.HelpfulNPEDemo1
//    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()"
//    because "com.example.java14.npeFeature.HelpfulNPEDemo1.myObject" is null
//    at com.example.java14.npeFeature.HelpfulNPEDemo1.main(com.example.java14.npeFeature.HelpfulNPEDemo1.java:6)


}