package lab3_2;

public class Cube extends Shape {
    public Cube(int l) {
        super(l, l, l);
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }

    @Override
    public double surfaceArea() {
        return 4 * super.surfaceArea();
    }
}
