package com.epam.lab.task3;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface CustomAnnotation {
    int id() default 1;
}

