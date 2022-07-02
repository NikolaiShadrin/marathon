package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Bob", "Jurist");
        Teacher teacher = new Teacher("proff Doje", "math");

        student.printInfo();
        teacher.printInfo();
    }
}
