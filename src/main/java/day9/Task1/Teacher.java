package day9.Task1;

public class Teacher extends Human {
    private String subject;

    Teacher (String name, String subject) {
        super(name);
        this.subject = subject;
    }

    String getSubject() {
        return subject;
    }

    @Override
    void printInfo() {
        super.printInfo();

        System.out.println("Это преподаватель с именем " + name);
    }
}
