package abstractionexample.restaurant;

public abstract class Restaurant {
    String name;

    Restaurant(String name){
        this.name = name;
    }
    abstract void prepareFood(String FoodItem);

    void displayRestaurant() {
        System.out.println("Restaurant: " + name);
    }
}
