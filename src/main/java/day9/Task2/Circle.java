package day9.Task2;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        int s;
        s = (int) (Math.PI * (radius*radius));
        return s;
    }

    @Override
    public double perimeter() {
        int w;
        w = (int) (2*Math.PI*radius);
        return w;
    }
}
