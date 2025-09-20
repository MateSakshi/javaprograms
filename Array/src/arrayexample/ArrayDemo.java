package arrayexample;

class Car{
    String company;
    String model;

    // Constructor
    Car(String model,String company){
        this.company = company;
        this.model = model;
    }
    // Method to display details
    void display(){
        System.out.println("Company: "+ company + ", Model: "+model);
    }
}
public class ArrayDemo {
    public static void main(String[] args) {

        // Create an array to hold 3 Car objects
        Car[] car = new Car[3];

        car[0] = new Car("i20","Hundai");
        car[1] = new Car("Nexon","Tata");
        car[2] = new Car("Innova","Toyota");

        // Access and display each car's details
        System.out.println("Car Details:");
        for(int i = 0; i < car.length; i++){
            car[i ].display();
        }
    }
}
