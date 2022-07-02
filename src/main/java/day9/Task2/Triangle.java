package day9.Task2;

public class Triangle extends Figure {
    private int length1;
    private int length2;
    private int length3;

    public Triangle(String color, int length1, int length2, int length3) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        int s;
        int p;
        p = (length1+length2+length3)/2;
        s = (int) Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));

        return s;
    }

    @Override
    public double perimeter() {
        int w;
        w = length1+length2+length3;
        return w;
    }
}
