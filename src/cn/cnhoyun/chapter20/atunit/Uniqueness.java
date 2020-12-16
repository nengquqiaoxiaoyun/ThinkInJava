// annotations/database/Uniqueness.java
// Sample of nested annotations
package cn.cnhoyun.chapter20.atunit;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
