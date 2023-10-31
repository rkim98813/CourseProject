package lesson.day4.Can;

public class BeerCan extends EmptyCan { // EmptyCan 상속 받음 (자식 클래스)
    // Override the printContent() method
    public void printContent() {
        System.out.println("흑맥주");
    }

    // Override the printName() method
    public void printName() {
        System.out.println("맥주캔입니다.");
    }

    // Add a new member method
    public void sayHello() {
        System.out.println("안녕하세요 맥주캔입니다.");
    }

    public static void main(String[] args) {
        BeerCan b = new BeerCan();
        b.printContent();
        b.printName();
        b.sayHello();
    }
}


