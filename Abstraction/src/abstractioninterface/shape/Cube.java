package abstractioninterface.shape;

public class Cube implements Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double CalculateVolume() {
        return side*side*side ;
    }

    @Override
    public double CalculateArea() {
        return 6*side*side;
    }
}
