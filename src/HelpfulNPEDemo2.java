public class HelpfulNPEDemo2 {

    public static void main(String... args) {
        Object myObject = null;
        myObject.toString().hashCode();
    }
//    javac HelpfulNPEDemo2.java
//    java -XX:+ShowCodedetilsInExceptionsMessages HelpfulNPEDemo2
//    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()"
//    because "<local1>" is null
//    at HelpfulNPEDemo2.main(HelpfulNPEDemo2.java:5)

//    javac -g HelpfulNPEDemo2.java
//    java -XX:+ShowCodedetilsInExceptionsMessages HelpfulNPEDemo2
//    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()"
//    because "myObject" is null
//    at HelpfulNPEDemo2.main(HelpfulNPEDemo2.java:5)



}