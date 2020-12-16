package cn.cnhoyun.chapter20.atunit;// annotations/UseCase.java

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    int id();

    String description() default "no description";

}
