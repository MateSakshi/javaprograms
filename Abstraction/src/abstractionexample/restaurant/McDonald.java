package abstractionexample.restaurant;

public class McDonald extends Restaurant {
    McDonald(String name) {
        super(name);
    }

    @Override
    void prepareFood(String FoodItem) {
        System.out.println(name + " is preparing " + FoodItem);
        }
}
