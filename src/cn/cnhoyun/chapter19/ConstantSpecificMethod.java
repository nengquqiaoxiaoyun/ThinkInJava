package cn.cnhoyun.chapter19;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author: huakaimay
 * @since: 2020-12-15
 */
public enum ConstantSpecificMethod {

    DATE_TIME {
        @Override
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    }, CLASSPATH {
        @Override
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    };

    abstract String getInfo();


    public static void main(String[] args) {
        for (ConstantSpecificMethod value : ConstantSpecificMethod.values()) {
            System.out.println(value.getInfo());
        }
    }

}
