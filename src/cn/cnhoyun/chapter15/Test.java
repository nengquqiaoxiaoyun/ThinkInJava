package cn.cnhoyun.chapter15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;

/**
 * @author: huakaimay
 * @since: 2020-12-14
 */
public class Test<E> {

    Object[] elementData = new Object[2];

    public void sort(Comparator<? super E> c) {
        Arrays.sort((E[]) elementData, 0, 2, c);
    }


    @Override
    public String toString() {
        return "Test{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }

    public static void main(String[] args) {
        Test<Integer> test = new Test();
        test.elementData[0] = 1;
        test.elementData[1] = 3;
        test.sort((f1, f2) -> f2 - f1);
        System.out.println(test);
    }
}
