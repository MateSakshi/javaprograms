package abstractioninterface.shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double CalculateVolume() {
        return (4/3)*Math.PI*radius*radius*radius;
    }

    @Override
    public double CalculateArea() {
        return Math.PI*radius*radius;
    }
}
