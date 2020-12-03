package cn.cnhoyun.test;

import java.util.Date;

/**
 * @author: huakaimay
 * @since: 2020-12-02
 */
public class TestThis {

    private Date date = new Date();

    private String str = "a";

    private Integer i;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    private String c;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

class B {


    public static void main(String[] args) {
        TestThis testThis = new TestThis();
        Date date = testThis.getDate();
        System.out.println(date);
        date.setTime(new Date().getTime() - 1000000l);
//        testThis.setDate(new Date(new Date().getTime() - 1000000l));
        Date date0 = testThis.getDate();
        System.out.println("date0: " + date0);

        System.out.println(date);

        String str = testThis.getC();
        System.out.println(str);

        String str2 = testThis.getC();
        str2 = "2";
        testThis.setStr("b");
        System.out.println(str2);
        System.out.println(str);



    }


}

class C {
    public static void main(String[] args) {
        TestThis testThis = new TestThis();
        Integer i = testThis.getI();
        i = 1;
        testThis.setI(2);
        
        System.out.println(i);
    }
}



