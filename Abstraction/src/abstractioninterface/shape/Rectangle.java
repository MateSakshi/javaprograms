package abstractioninterface.shape;

public class Rectangle implements Shape {
    private double length;
    private double width;
    private double height;

    public Rectangle(double length,double width,double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double CalculateVolume() {
        return length * width * height;
    }

    @Override
    public double CalculateArea() {
        return length * width;
    }
}
