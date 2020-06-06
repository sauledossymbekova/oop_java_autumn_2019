package lab3_2;

public class Sphere extends Shape {
    public Sphere(int r) {
        super(r, r, 2 * r);
    }

    @Override
    public double getVolume() {
        return 2.0 / 3 * Math.PI * length * width * height;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * length * width;
    }
}
