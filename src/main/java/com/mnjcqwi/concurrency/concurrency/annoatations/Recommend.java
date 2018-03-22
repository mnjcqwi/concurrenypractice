package com.mnjcqwi.concurrency.concurrency.annoatations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.Type)
@Retention(RetentionPolicy.CLASS)
public @interface Recommend {
    String value() default "";
}
