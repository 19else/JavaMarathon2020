package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов", "История");
        Student student = new Student("Петров");
        teacher.evaluate(student);
        teacher.setSubject("Литература");
        student.setName("Смирнов");
        teacher.evaluate(student);
    }
}
