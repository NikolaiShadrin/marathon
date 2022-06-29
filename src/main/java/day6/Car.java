package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfIssue;
    private int sum;

    public void setModel(String userModel) {
        model = userModel;
    }

    public String getModel () {
        return model;
    }

    public void setColor(String userColor) {
        color = userColor;
    }

    public String getColor() {
        return color;
    }

    public void setYearOfIssue(int userYear) {
        yearOfIssue = userYear;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
        sum = inputYear - yearOfIssue;

        if (sum < 0) {
            sum = Math.abs(sum);
        }
        return sum;
    }
}
