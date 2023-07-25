package com.example.java14.npeFeature;

public class HelpfulNPEDemo2 {

    public static void main(String... args) {
        Object myObject = null;
        myObject.toString().hashCode();
    }
//    javac com.example.java14.npeFeature.HelpfulNPEDemo2.java
//    java -XX:+ShowCodedetilsInExceptionsMessages com.example.java14.npeFeature.HelpfulNPEDemo2
//    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()"
//    because "<local1>" is null
//    at com.example.java14.npeFeature.HelpfulNPEDemo2.main(com.example.java14.npeFeature.HelpfulNPEDemo2.java:5)

//    javac -g com.example.java14.npeFeature.HelpfulNPEDemo2.java
//    java -XX:+ShowCodedetilsInExceptionsMessages com.example.java14.npeFeature.HelpfulNPEDemo2
//    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()"
//    because "myObject" is null
//    at com.example.java14.npeFeature.HelpfulNPEDemo2.main(com.example.java14.npeFeature.HelpfulNPEDemo2.java:5)



}