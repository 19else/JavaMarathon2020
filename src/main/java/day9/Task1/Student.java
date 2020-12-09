package day9.Task1;

public class Student extends Human {
    private String nameGroup;

    public Student(String nameGroup, String name) {
        super(name);
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }
}
