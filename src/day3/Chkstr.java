package day3;

import java.util.Scanner;

class Ts {
    public static final int NUM = 1;
    public static final int STR = 2;

    private final String s;
    private final String t;

    public Ts(String s, String t) { //생성자
        this.s = s;
        this.t = t;
    }

    public int check() {
        boolean isItNumS = isItNum(s);
        boolean isItNumT = isItNum(t);

        if (isItNumS && isItNumT) {
            return NUM;
        } else {
            return STR;
        }
    }

    private boolean isItNum(String str) {
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

public class Chkstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 입력: ");
        String s = sc.nextLine();
        System.out.println("두번째 입력: ");
        String t = sc.nextLine();
        int result;
        double a,b;

        Ts P = new Ts(s, t);
        int cond = P.check();

        if (cond == Ts.STR) {
            result = s.compareTo(t);
            System.out.println("비교값 (as strings): " + result);
        } else {
            a = Double.parseDouble(s);
            b = Double.parseDouble(t);

            if (a > b) {
                System.out.println("비교값 (as doubles): 1");
            } else if (a < b) {
                System.out.println("비교값 (as doubles): -1");
            } else {
                System.out.println("비교값 (as doubles): 0");
            }
        }
    }
}

