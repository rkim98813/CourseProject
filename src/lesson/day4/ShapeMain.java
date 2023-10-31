package lesson.day4;

//추상 클래스를 이용한 작업 구조 abstract 클래스를 이용한 작업 레벨링의 예

abstract class Shape {
    public abstract void draw();
    public abstract void delete();
} //end of Shape abstract class
class Circle extends Shape {
    public void draw(){
        System.out.println("원을 그립니다");
    }
    public void delete(){
        System.out.println("원을 지웁니다");
    }
} //end of Circle class
class Triangle extends Shape {
    public void draw(){
        System.out.println("삼각형을 하나, 둘, 셋, 그립니다.");
    }
    public void delete(){
        System.out.println("삼각형을 지웁니다");
    }
} //end of Triangle class


class Rectangle extends Shape {
    public void draw(){
        System.out.println("사각형을 원, 투, 쓰리, 포 그립니다.");
    }
    public void delete(){
        System.out.println("사각형을 지웁니다");
    }
} //end of Rectangle class
public class ShapeMain {
    public static void main(String[] args){
        Circle c = new Circle();
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
//1. 각각의 도형 그리기
        c.draw();
        t.draw();
        r.draw();
//2. 각각의 도형 지우기
        c.delete();
        t.delete();
        r.delete();
    } //end of main
} //end of ShapeMain class