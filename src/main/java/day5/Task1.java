package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Mercedes");
        car1.setColor("White");
        car1.setYearOfIssue(2015);

        System.out.println("Марка автомобиля: " + car1.getModel());
        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Год выпуска: " + car1.getYearOfIssue());
        System.out.println(" ");

        Motorbike moto1 = new Motorbike("БМВ","черный",2020);

        System.out.println("Модель: " + moto1.getModel());
        System.out.println("Цвет: " + moto1.getColor());
        System.out.println("Год: " + moto1.getYearOfIssue());
    }
}
