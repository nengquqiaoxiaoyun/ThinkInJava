// generics/CovariantArrays.java
package cn.cnhoyun.chapter15.whildcard;

class Fruit {
    void fruid() {
        System.out.println("furit : fruid");
    }
}

class Apple extends Fruit {
    void b(){
        System.out.println("apple : b");
    }
}

class Jonathan extends Apple {
}

class Orange extends Fruit {
    void orange() {
        System.out.println("orange");
    }
}

public class CovariantArrays {

    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple(); // OK
        fruit[1] = new Jonathan(); // OK
        // Runtime type is Apple[], not Fruit[] or Orange[]:
        try {
            // Compiler allows you to add Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            // Compiler allows you to add Oranges:
            fruit[0] = new Orange(); // ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
/* Output:
java.lang.ArrayStoreException: Fruit
java.lang.ArrayStoreException: Orange
 */
