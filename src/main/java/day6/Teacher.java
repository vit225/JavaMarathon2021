package day6;

import java.util.Random;

public class Teacher {
    String name, subject;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student) {
        int number = random.nextInt(4) + 2;
        String assessment = null;
        switch (number) {
            case 2:
                assessment = "неудовлетворительно";
                break;
            case 3:
                assessment = "удовлетворительно";
                break;
            case 4:
                assessment = "хорошо";
                break;
            case 5:
                assessment = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.name + " по предмету "
                + subject + " на оценку " + assessment);
    }
}
