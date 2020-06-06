package lab3_2;

public abstract class Shape {
    int length;
    int width;
    int height;
    public Shape() {

    }
    public Shape(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
    public double getVolume(){
        return length * width * height;
    }
    public double surfaceArea() {
        return length * width;
    }
}
