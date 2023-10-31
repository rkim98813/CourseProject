package lesson.day4.Can;

// 추상의 추상-추상 클래스의 메서드를 모두 구현하지 않은 예 (부모 클래스)
public abstract class InCompleteCan extends EmptyCan {
    //EmptyCan의 printName() 구현
    public void printName() {
        System.out.println("InCompleteCan 에 서 printName() 구현");
    }
} //end of InCompleteCan class

