package exercise.week1.day4.cmpMultiInherit;

import java.util.Scanner;


interface Ts{  //내부 돌리기 위해서 public 사용X
    int cmp() ;
}

class Tr {
    protected final String s;
    protected final String t;

    public Tr(String s, String t) {
        this.s = s;
        this.t = t;
    }
    //public abstract int cmp(); //추상 클라스: 미완성 클라스 - 자체적으로 객체 생성 불가
}

class Strcmp extends Tr implements Ts{ //상속 Tr Ts
    public Strcmp(String s, String t) {
        super(s, t);
    }

    public int cmp() {  //미완성 클라스 완전 구현
        System.out.println("문자이군요");
        return s.compareTo(t);
    }
}

class Numcmp extends Tr implements Ts{ //상속 Tr Ts
    public Numcmp(String s, String t) {
        super(s, t);
    }

    public int cmp() {
        System.out.println("숫자이군요");
        double num1 = Double.parseDouble(s);
        double num2 = Double.parseDouble(t);
        return Double.compare(num1, num2);
    }
}

class Select extends Tr {

    //private final String s;
    //private final String t;
    public Select(String s, String t) {
        super (s, t);
        //this.s = s;
        //this.t = t;
    }

    public Ts check() { //Q값을 interface Ts에서 사용해야 한다.
        boolean isNumericS = isNumeric(s);
        boolean isNumericT = isNumeric(t);

        if (isNumericS && isNumericT) {
            return new Numcmp(s, t);
        } else {
            return new Strcmp(s, t);
        }
    }

    private boolean isNumeric(String str) {
        int length = str.length();

        if (length == 0) {
            return false;
        }

        if (!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-') {
            return false;
        }

        for (int i = 1; i < length; i++) {
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.') {
                return false;
            }
        }
        return true;
    }
}

public class cmpMultiInherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 입력: ");
        String s = sc.nextLine();

        System.out.println("두번째 입력: ");
        String t = sc.nextLine();

        Select P;

        Ts Q;

        P = new Select(s, t);
        Q = P.check(); // Up Casting: check가 받는 Numcmp 미정, interface cmp 작동 후 값을 Q에 반환

        System.out.println("비교값 : " + Q.cmp());
    }
}





