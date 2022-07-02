package day9.Task2;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        int s;
        s = width*height;
        return s;
    }

    @Override
    public double perimeter() {
        int w;
        w = (width+height)*2;
        return w;
    }
}
