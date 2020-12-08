package day9.Task1;

public class Student extends Human {
    private String nameGroup;

    Student (String nameGroup, String name) {
        super(name);
        this.nameGroup = nameGroup;
    }

    String getNameGroup() {
        return nameGroup;
    }

    @Override
    void printInfo() {
        super.printInfo();

        System.out.println("Этот студент с именем " + name);

    }
}
