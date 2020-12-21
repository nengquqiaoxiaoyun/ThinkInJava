package cn.cnhoyun.java8func.chapter2;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;

/**
 * @author: huakaimay
 * @since: 2020-12-18
 */
public class DateFormatterCreate {
    private static final ThreadLocal<DateFormatter> dateFormatterCreateThreadLocal = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("yyyy-MM-dd")));


}
