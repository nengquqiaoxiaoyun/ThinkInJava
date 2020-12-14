package cn.cnhoyun.chapter15;

import java.lang.reflect.Constructor;


public class E22_InstantiateGenericType2 {
    public static void main(String[] args) {
        ClassAsFactory1<Employee> fe =
                new ClassAsFactory1<>(Employee.class);
        Employee emp = fe.create(0);
        if (emp == null)
            System.out.println("Employee cannot be instantiated!");

        System.out.println(emp);
        ClassAsFactory1<Integer> fi =
                new ClassAsFactory1<>(Integer.class);
        Integer i = fi.create(2);
        if (i == null)
            System.out.println("Integer cannot be instantiated!");
        System.out.println(i);
    }
}

class ClassAsFactory1<T> {
    Class<T> kind;

    public ClassAsFactory1(Class<T> kind) {
        this.kind = kind;
    }

    public T create(int arg) {
        try {
            // Technique 1 (verbose)
            for (Constructor<?> ctor : kind.getConstructors()) {
                // Look for a constructor with a single parameter:
                Class<?>[] params = ctor.getParameterTypes();
                if (params.length == 1)
                    if (params[0] == int.class)
                        return kind.cast(ctor.newInstance(arg));
            }
            // Technique 2 (direct)
            // Constructor<T> ct = kind.getConstructor(int.class);
            // return ct.newInstance(arg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}