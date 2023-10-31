package lesson.day4.Generic;


class Student<T> {
    private T name;
    public void set(T name) { this.name = name; }
    public T get() { return name; }
}
public class StudentGeneric {
    public static void main(String[] args) {
        Student<String> s = new Student<String>(); // Student를 사용할 때에 T 대신에 사용할 타입 String을 넣었다.
        s.set("김길동");
        System.out.println(s.get());
    }
}
