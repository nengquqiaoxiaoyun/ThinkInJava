// typeinfo/PetCount4.java
package cn.cnhoyun.chapter14.instance;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        Pets.stream()
                .limit(20)
                .peek(counter::count)
                .forEach(p -> System.out.print(
                        p.getClass().getSimpleName() + " "));
        System.out.println();
        System.out.println("counter: " + counter);
    }
}
