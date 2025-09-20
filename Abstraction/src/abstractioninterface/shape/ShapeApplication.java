package abstractioninterface.shape;

public class ShapeApplication {
    public static void main(String[] args){
        Shape circle = new Circle(4);
        System.out.println("Area of circle is:"+circle.CalculateArea());
        System.out.println("Volume of circle is:"+circle.CalculateVolume());
        System.out.println("------------------");

        Shape rectangle= new Rectangle(4,5,5);
        System.out.println("Area of rectangle is:"+rectangle.CalculateArea());
        System.out.println("Volume of rectangle is:"+rectangle.CalculateVolume());
        System.out.println("------------------");

        Shape cube = new Cube(4);
        System.out.println("Area of cube is:"+cube.CalculateArea());
        System.out.println("Volume of cube is:"+cube.CalculateVolume());


    }
}
