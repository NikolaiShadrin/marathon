package day6;

import java.util.Random;

public class Teacher {
    Random rdm = new Random();

    private String name;
    private String subject;


    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void evaluate(Student s) {
        int mark = rdm.nextInt(4) +2;
        String markWord;

        if (mark<=3) {
            markWord = "Удовлетворительно";
        } else if (mark==4){
            markWord = "Хорошо";
        } else {
            markWord = "Отлично";
        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " + s.getName() +
                " по предмету " + subject+ " на оценку "+ markWord);

    }
}
