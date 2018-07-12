package ru.elanlum.task7;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Boat {
    int uniqueNumber();
    int length();
    int width();
    String name();
}
