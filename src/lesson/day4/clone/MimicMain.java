package lesson.day4.clone;

class Mimic extends Object implements Cloneable{ //Cloneable 명시
    private int id;
    private String name;
    public Mimic(int id, String name){
        this.id = id; this.name = name;
    }
    //clone() 메서드의 재정의
    public Object clone() throws CloneNotSupportedException{
        return super.clone(); //Object의 clone()을 이용한 메모리 복제
    }
    //toString() 메서드의 재정의
    public String toString(){
        return this.id + ":" + this.name;
    }
} //end of Mimic class
public class MimicMain{
    public static void main(String[] args) throws
            CloneNotSupportedException{
        Mimic m = new Mimic(1000, "호랑이"); //객체 생성
        Mimic n = (Mimic)m.clone(); //복사를 위한 메서드 사용
        System.out.println(m.hashCode() + " " + m);
//참조값 출력
        System.out.println(n.hashCode() + " " + n);
//참조값 출력
    } //end of main
} //end of MimicMain class
