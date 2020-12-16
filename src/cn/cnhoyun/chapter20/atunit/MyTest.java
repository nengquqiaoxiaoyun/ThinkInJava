// onjava/atunit/Test.java
// The @Test tag
package cn.cnhoyun.chapter20.atunit;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {

}
