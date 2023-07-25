package com.example.java14.records;

import java.time.Duration;

public class RecordsDemo {

    public static void main(String[] args) {
        Course course = new Course("What's new in Java 14", Duration.ofHours(1), 5);
        System.out.println(course); // Course[name=What's new in Java 14, duration=PT1H, rating=5]
        Course course2 = new Course("What's new in Java 14", Duration.ofHours(1), 5);
        System.out.println(course == course2); // false
        System.out.println(course.equals(course2)); // true
//        The reference comparison returns false because we're actually constructing two distinct objects even though
//        they have the same values. However, equals returns true because they're both instances of the course record type,
//        and all components have exactly the same value.
        Course course3 = new Course("What's new in Java 14", Duration.ofHours(1), 6);
//        Exception in thread "main" java.lang.IllegalArgumentException
//        at com.example.java14.records.Course.<init>(Course.java:8)
//        at com.example.java14.records.RecordsDemo.main(RecordsDemo.java:16)

    }
}
