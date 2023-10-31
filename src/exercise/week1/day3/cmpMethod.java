package exercise.week1.day3;

import java.util.Scanner;

class Tr {
    protected final String s;
    protected final String t;

    public Tr(String s, String t) {
        this.s = s;
        this.t = t;
    }
}

class Strcmp extends Tr {
    public Strcmp(String s, String t) {
        super(s, t);
    }

    public int cmp() {
        System.out.println("문자이군요");
        return s.compareTo(t);
    }
}

class Numcmp extends Tr {
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
    public Select(String s, String t) {
        super(s, t);
    }

    public Tr check() {
        boolean isNumericS = isNumeric(s);
        boolean isNumericT = isNumeric(t);

        if (isNumericS && isNumericT) {
            return new Numcmp(s, t);
        } else {
            return new Strcmp(s, t);
        }
    }

    public int connect(Tr cmpObject) {
        if (cmpObject instanceof Numcmp) {
            return ((Numcmp) cmpObject).cmp();
        } else {
            return ((Strcmp) cmpObject).cmp();
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

public class cmpMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 입력: ");
        String s = sc.nextLine();

        System.out.println("두번째 입력: ");
        String t = sc.nextLine();

        Tr P = new Select(s, t);
        Tr Q = ((Select)P).check( );

        int result;
        result = ((Select)P).connect(Q);

        if (Q instanceof Numcmp) {
            System.out.println("비교값 (as doubles): " + result);
        } else {
            System.out.println("비교값 (as strings): " + result);
        }
    }
}