package abstractionexample.restaurant;

public class RestaurantApplication {
    public static void main(String[] args) {
        Restaurant r1 = new BurgerKing("BurgerKing");
        Restaurant r2 = new PizzaHut("PizzaHut");
        Restaurant r3 = new McDonald("McDonald");


        r1.displayRestaurant();
        r1.prepareFood("Veg Burger");
        System.out.println();

        r2.displayRestaurant();
        r2.prepareFood("Veg Pizza");
        System.out.println();

        r3.displayRestaurant();
        r3.prepareFood("Periperi_Fries");
    }
}
