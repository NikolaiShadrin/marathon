package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String manufacturer, int year, int length, int weight, int fuel) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.weight = weight;
        this.fuel = fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight  + ", количество топлива в баке: " + fuel);
    }

    int fillUp (int n) {
        fuel = fuel + n;
        return fuel;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setLength(int length) {
        this.length = length;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    void setFuel(int fuel) {
        this.fuel = fuel;
    }

    int getFuel() {
        return fuel;
    }


}
