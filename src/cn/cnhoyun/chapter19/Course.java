// enums/menu/Course.java
package cn.cnhoyun.chapter19;

public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    private Food[] values;

    private Course(Class<? extends Food> kindCls) {
        values = kindCls.getEnumConstants();
    }

    public Food[] getValues() {
        return values;
    }

    public Food randomSelection() {
        return Enums.random(values);
    }
}
