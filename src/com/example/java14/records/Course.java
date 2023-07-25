package com.example.java14.records;

import java.time.Duration;

public record Course(String name, Duration duration, int rating) {

    //    Our course is now a plain data container, and that's fine.
//    But sometimes you want to put validations on whatever data can be put into this container.
//    We can do this by adding a constructor to the record that does the validation.
//    we don't have to add any assignment statements here to initialize the component values.
//    Again, because we leave the parameter list implicit, these assignments also happen implicitly.
    public Course {
        if (rating > 5) {
            throw new IllegalArgumentException();
        }
    }
}
