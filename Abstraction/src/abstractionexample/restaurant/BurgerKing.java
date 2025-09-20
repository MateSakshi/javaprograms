package abstractionexample.restaurant;

public class BurgerKing extends Restaurant {

    BurgerKing(String name) {
        super(name);
    }

    void prepareFood(String FoodItem) {
        System.out.println(name + " is preparing " + FoodItem);
    }
}
