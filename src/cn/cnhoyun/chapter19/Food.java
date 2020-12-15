// enums/menu/Food.java
// Subcategorization of enums within interfaces
package cn.cnhoyun.chapter19;

public interface Food {
    enum Appetizer implements Food {
        SALAD, SOUP, SPRING_ROLLS;
    }

    enum MainCourse implements Food {
        LASAGNE, BURRITO, PAD_THAI,
        LENTILS, HUMMOUS, VINDALOO;
    }

    enum Dessert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE,
        FRUIT, CREME_CARAMEL;
    }

    enum Coffee implements Food {
        BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
        LATTE, CAPPUCCINO, TEA, HERB_TEA;
    }

    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.VINDALOO;
        food = Dessert.GELATO;
        food = Coffee.BLACK_COFFEE;

    }
}
