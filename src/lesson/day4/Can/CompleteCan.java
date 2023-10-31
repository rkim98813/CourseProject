package lesson.day4.Can;

// 모든 추상 메서드의 구현 InCompleteCan에 남아 있던 모든 추상메서드를 구현한 후 객체를 생성하는 예
public class CompleteCan extends InCompleteCan {
    //EmptyCan의 printContent() 구현
    public void printContent() {
        System.out.println("CompleteCan에서 printContent() 구현");
    }

    //새로운 멤버 메서드 추가
    public void sayHello() {
        System.out.println("CompleteCan에서 sayHello() 추가 구현");
    }

    public static void main(String args[]) {
        CompleteCan cc = new CompleteCan(); //객체 생성
        cc.printName();
        cc.printContent();
        cc.sayHello();
    } //end of main
} //end of Complete class
