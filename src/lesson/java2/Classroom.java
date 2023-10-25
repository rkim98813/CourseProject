package lesson;

class MyClass {
    private String name;
    private int age;

    // Constructors
    public MyClass() {
    }

    public MyClass(String a, int b) {
        this.name = a;
        this.age = b;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String a) {
        this.name = a;
    }

    public void setAge(int b) {
        this.age = b;
    }

    // Deep Copy - Using Cloneable interface
    public Object clone() {
        MyClass a = new MyClass();
        a.setName(this.name);
        a.setAge(this.age);
        return a; // Return the newly created object
    }
}

public class Classroom{
    public static void main(String[] args) {
        // Shallow Copy Example
        MyClass c1 = new MyClass("이태호", 25);
        MyClass c2 = c1; // Shallow copy

        c2.setAge(99); // This changes the age of both c1 and c2
        System.out.println(c1.getAge()); // Prints 99
        System.out.println(c2.getAge()); // Prints 99

        // Deep Copy Example
        MyClass c3 = new MyClass("이태호", 25);
        MyClass c4 = (MyClass) c3.clone(); // Deep copy

        c4.setAge(99); // This only changes the age of c4, not c3
        System.out.println(c3.getAge()); // Prints 25
        System.out.println(c4.getAge()); // Prints 99
    }
}
