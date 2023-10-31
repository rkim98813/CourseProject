package lesson.day4.innerClass;

class EX1_1 {
    class InstanceInner {
        //앞 페이지 -EX1 동일
    }
    static class StaticInner {
        //앞 페이지 -EX1 동일
    }
    void myMethod() {
        class LocalInner {
            int a = 300;
            static int b = 300; // error static 변수선언불가
            final static int c = 300; // final static가 동시에 붙은 변수는 상수이므로 사용가능
        }
    }
    public static void main(String args[]) {
        //앞 페이지 -EX1 동일
        System.out.println(EX1.InstanceInner.c);
        System.out.println(EX1.StaticInner.b);
    }
}

