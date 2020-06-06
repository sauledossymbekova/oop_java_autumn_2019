package lab3_2;

public class Cylinder extends Shape{
    public Cylinder(double r, double h){
        super((int)r, (int)r, (int)h);
    }

    @Override
    public double getVolume() {
        return 2 * Math.PI * length * width * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * length * (width + height);
    }
}
