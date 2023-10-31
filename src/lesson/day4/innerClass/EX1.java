package lesson.day4.innerClass;

class EX1{
    class InstanceInner { //main class 내에 생성하지 않는다.
        int a = 100; // 객체 생성후 접근 가능
        static int b = 100; // error static 변수선언불가
        final static int c = 100; // final static가 동시에 붙은 변수는 상수이므로 사용가능
    }
    static class StaticInner {
        int a = 200; // 객체 생성후 접근 가능
        static int b = 200; // 스태틱 클래스(static class)에서만 staitc변수 사용 가능
    }
    public static void main(String args[]) {
        //System.out.println(InstanceInner.a); //사용불가
        //System.out.println(InstanceInner.b); //사용불가

        System.out.println(InstanceInner.c);
        System.out.println(StaticInner.b);
    }
}

