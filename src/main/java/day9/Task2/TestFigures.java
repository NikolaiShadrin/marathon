package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 20, 30, 10),
                new Triangle("Red", 20, 15, 10),
                new Rectangle("Red", 10, 5),
                new Rectangle("Orange", 15, 40),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        int x = 0;
        for (Figure figure: figures) {
            if (figure.getColor().equals("Red")) {
                x =  x + (int)(figure.perimeter());
            };
        }
        return x;
    }

    public static double calculateRedArea(Figure[] figures) {
        int p = 0;
        for (Figure figure: figures) {
            if (figure.getColor().equals("Red")) {
                p = (int) (p + figure.area());
            }
        }

        return p;

    }


}
