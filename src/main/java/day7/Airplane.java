package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String manufacturer, int year, int length, int weight, int fuel) {
        this.manufacturer = manufacturer;
        this.length = length;
        this.year = year;
        this.weight = weight;
        this.fuel = fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight  + ", количество топлива в баке: " + fuel);
    }


    public void fillUp(int n) {

        fuel = fuel + n;
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

    public static void compareAirplanes(Airplane s, Airplane y) {

        if (s.length > y.length) {
            System.out.println("Самолет " + s.manufacturer + " длинее, чем самолет " + y.manufacturer);
        } else if (s.length < y.length) {
            System.out.println("Самолет " + y.manufacturer + " длинее, чем самолет " + s.manufacturer);
        } else {
            System.out.println("Самолеты равной длинны");
        }
    }


}
