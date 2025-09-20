package abstractionexample.restaurant;

public class PizzaHut extends Restaurant {
    PizzaHut(String name) {
        super(name);
    }

    @Override
    void prepareFood(String FoodItem) {
        System.out.println(name + " is preparing " + FoodItem);
        }
}
