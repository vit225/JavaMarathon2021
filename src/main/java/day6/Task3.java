package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Марья Ивановна", "математика");
        Student student = new Student("Вова");
        teacher.evaluate(student);
    }
}
