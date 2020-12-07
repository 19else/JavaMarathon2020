package day6;

public class Teacher {
    private String name;
    private String subject;
    private String score;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int score = 2 + (int) (Math.random() * 4);
        switch (score) {
            case 2:
                this.score = "неудовлетворительно";
            case 3:
                this.score = "удовлетворительно";
            case 4:

                this.score = "хорошо";
            case 5:
                this.score = "отлично";
                System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                        " по предмету " + subject + " на оценку " + this.score);
        }
    }
}
