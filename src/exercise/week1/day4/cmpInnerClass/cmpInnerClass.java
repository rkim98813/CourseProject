package exercise.week1.day4.cmpInnerClass;
import java.util.Scanner;

class Select {
    private final String s;
    private final String t;

    public Select(String s, String t) {
        this.s = s;
        this.t = t;
    }

    abstract class Cmp {
        public abstract int cmp();
    }

    class Numcmp extends Cmp {
        public int cmp() {
            System.out.println("숫자이군요");
            double num1 = Double.parseDouble(s);
            double num2 = Double.parseDouble(t);
            return Double.compare(num1, num2);
        }
    }

    public Cmp check() {
        if (!isNumeric(s)|| !isNumeric(t)){
            System.out.println("숫자만 받습니다. 종료합니다");
            System.exit(0);
        }
        return new Numcmp();
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

public class cmpInnerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 입력(숫자만 받습니다): ");
        String s = sc.nextLine();

        System.out.println("두번째 입력(숫자만 받습니다): ");
        String t = sc.nextLine();

        Select P = new Select(s, t);
        Select.Cmp Q;
        Q = P.check();

        System.out.println("비교값 : " + Q.cmp());

        /*int result = Q.cmp();
        System.out.println(result);*/
    }
}




