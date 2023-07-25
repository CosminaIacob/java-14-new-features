public class HelpfulNPEDemo1 {

    static Object myObject = null;

    public static void main(String... args) {
        myObject.toString().hashCode();
    }

//    javac HelpfulNPEDemo1.java
//    java -XX:+ShowCodedetilsInExceptionsMessages HelpfulNPEDemo1
//    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()"
//    because "HelpfulNPEDemo1.myObject" is null
//    at HelpfulNPEDemo1.main(HelpfulNPEDemo1.java:6)


}