package cn.cnhoyun.chapter5;

/**
 * @author: huakaimay
 * @since: 2020-12-04
 */
public class C5_1 {

    public static void main(String[] args) {
        new Demo1();
    }
}

/**
 * * 1.
 * * Create a class with an uninitialized
 * * String reference. Demonstrate that this
 * * reference is initialized by Java to null.
 */
class Demo1 {
    private String str;
    public Demo1() {
        System.out.println(str);
    }

    public Demo1(String s) {
        this();
        System.out.println(str);
    }

    void a() {
    }
}

/**
 * * 2.
 * * Create a class with a String field initialized
 * * at the point of definition, and another one
 * * initialized by the constructor. What is the
 * * difference between the two approaches?
 * <p>
 * 调用构造器
 * 按照属性的声明顺序
 * str 在构造器初始化前初始化了
 * conStr 被初始化为null
 * 执行构造器的主体
 * conStr 被赋值
 * conStr 更加灵活，可以通过构造器传参设置
 */
class Demo2 {
    private String str = "initialized";
    private String conStr;

    public Demo2() {
        this.conStr = "init by con";
    }

}

