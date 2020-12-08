package cn.cnhoyun.chapter14;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-12-08
 */
public class Rhomboid implements Shape {

    public static void main(String[] args) {
        Shape shape = new Rhomboid();
        Rhomboid r = (Rhomboid) shape;
        System.out.println(r);
        // 编译时成功，运行时将报错：ClassCastException
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            System.out.println(c);
        }
    }

    @Override
    public String toString() {
        return "Rhomboid";
    }

    @Test
    public void test() {
        List<Shape> shapes = Arrays.asList(new Circle(), new Rhomboid());
        for (Shape shape : shapes) {
            if (!(shape instanceof Circle)) {
                shape.rotate(shape);
            }
        }
    }

    @Override
    public void rotate(Shape shape) {
        System.out.println("旋转" + shape.getClass().getSimpleName() + "45° ");
    }
}


class Circle implements Shape {
    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public void rotate(Shape shape) {
        System.out.println("Error: 圆形不用旋转");
        throw new UnsupportedOperationException();
    }
}

interface Shape {

    /**
     * 如果旋转的是Circle就不执行
     *
     * @param shape
     */
    void rotate(Shape shape);

    String toString();
}

