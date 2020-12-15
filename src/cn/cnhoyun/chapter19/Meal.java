package cn.cnhoyun.chapter19;


/**
 * @author: huakaimay
 * @since: 2020-12-15
 */
public class Meal {
    public static void main(String[] args) {
            for (Course course : Course.values()) {
                Food food = course.randomSelection();
                System.out.println(food);
            }
            System.out.println("***");

        for (Course value : Course.values()) {
            Food[] values = value.getValues();
            for (Food food : values) {
                System.out.println(food);
            }
        }

    }
}
