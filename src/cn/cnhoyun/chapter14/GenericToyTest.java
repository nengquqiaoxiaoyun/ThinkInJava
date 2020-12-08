// typeinfo/toys/GenericToyTest.java
// 测试 Class 类
// {java typeinfo.toys.GenericToyTest}
package cn.cnhoyun.chapter14;

public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // Produces exact type:
        FancyToy fancyToy = ftClass.newInstance();

        Class<? super FancyToy> superclass = ftClass.getSuperclass();
        // This won't compile:
        // Class<Toy> up2 = ftClass.getSuperclass();
        // Only produces Object:
        Object obj = superclass.newInstance();
    }
}
