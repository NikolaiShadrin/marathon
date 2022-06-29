package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorbike moto1 = new Motorbike("БМВ", "черный", 2010);

        car1.info();
        moto1.info();

        System.out.println(moto1.yearDifference(2000));

    }
}
