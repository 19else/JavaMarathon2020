package day9.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название группы студента и название предмета предодавателя: ");
        String group = scanner.nextLine();
        String subj = scanner.nextLine();
        Student student = new Student(group, "Vasia");
        Teacher teacher = new Teacher("Fedor", subj);
        student.printInfo();
        teacher.printInfo();
        System.out.println(student.getNameGroup());
        System.out.println(teacher.getSubject());
    }
}
