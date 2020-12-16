// annotations/database/Member.java
package cn.cnhoyun.chapter20;

import cn.cnhoyun.chapter20.atunit.Constraints;
import cn.cnhoyun.chapter20.atunit.DBTable;
import cn.cnhoyun.chapter20.atunit.SQLInteger;
import cn.cnhoyun.chapter20.atunit.SQLString;

@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30)
    String firstName;
    @SQLString(50)
    String lastName;
    @SQLInteger
    Integer age;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true, unique = true))
    String reference;
    static int memberCount;

    public String getReference() {
        return reference;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return reference;
    }

    public Integer getAge() {
        return age;
    }
}
