package day5;

public class Car {
    private String model;
    private String color;
    private int yearOfIssue;

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

}
