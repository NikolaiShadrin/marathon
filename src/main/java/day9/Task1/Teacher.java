package day9.Task1;

public class Teacher extends Human{
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем "+super.name);
        System.out.println("Этот преподаватель с именем "+name);
    }
}
