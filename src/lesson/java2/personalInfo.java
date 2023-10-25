package lesson;


class Person {
    String name;
    int age;
    String job;

    public Person(String a, int b) {
        this.name = a;
        this.age = b;
    }
}

class Student extends Person {
    public Student(String a, int b) {
        super(a, b);
        this.job = "학생";
    }

    public void Behavior() {
        System.out.println(name + " " + age + "세 " + job + " 행동: 과제중..");
    }
}

class Professor extends Person {
    public Professor(String a, int b) {
        super(a, b);
        this.job = "교수";
    }

    public void Behavior() {
        System.out.println(name + " " + age + "세 " + job + " 행동: 과제내는중..");
    }
}

public class personalInfo{
    public static void main(String args[]) {
        // Inheritance
        Student student = new Student("문주영", 24);
        Professor professor = new Professor("최세지", 42);
        student.Behavior();
        professor.Behavior();
    }
}