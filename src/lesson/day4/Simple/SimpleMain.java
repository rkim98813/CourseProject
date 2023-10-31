package lesson.day4.Simple;

/**
 상속만으로 구현되는 추상 클래스
 **/
//단순히 추상 클래스를 상속만 함
class SimpleCollector extends SimpleAdapter{
//...내용없음
} //end of SimpleCollector class

public class SimpleMain {
    public static void main(String[] args) {
        SimpleCollector s = new SimpleCollector(); //객체 생성
        s.printHello(); //멤버 메서드 호출
    } //end of main
} //end of SimpleMain class
