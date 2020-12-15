package cn.cnhoyun.chapter15.c29;

import cn.cnhoyun.chapter15.whildcard.Holder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-12-15
 */
public class HolderList {

    private static void testHoler(Holder<List<?>> holder) {
        holder.set(new ArrayList<Integer>());
        List<?> list = holder.get();

        // list cannot set
        System.out.println(holder.getClass().getSimpleName());
        System.out.println(list.getClass().getSimpleName());
        Object o = list.get(0);
    }


    private static void testList(List<Holder<?>> list) {
        list.add(new Holder<List>());
        Holder<?> holder = list.get(0);
        Object o = holder.get();
        // holder can not set

    }

    public static void main(String[] args) {
        Holder<List<?>> holder = new Holder<>();
        testHoler(holder);
    }

}
