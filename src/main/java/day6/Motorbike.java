package day6;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfIssue;
    private int sum;

    public Motorbike(String model, String color, int yearOfIssue) {
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear) {
        sum = inputYear - yearOfIssue;

        if(sum<0) {
            sum = Math.abs(sum);
        }
        return sum;
    }
}
