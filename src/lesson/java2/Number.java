package lesson;

class IntNumber {
    private int num1;
    private int num2;

    public IntNumber(int r, int i) {
        num1 = r;
        num2 = i;
    }

    int getNum1() {
        return num1;
    }

    int getNum2() {
        return num2;
    }

    public IntNumber add(IntNumber c) {
        int resultReal = num1 + c.getNum1();
        int resultImag = num2 + c.getNum2();
        return new IntNumber(resultReal, resultImag);
    }
}

public class Number {
    public static void main(String[] args) {
        IntNumber com1 = new IntNumber(6, 17);
        IntNumber com2 = com1.add(com1);

        System.out.println(com1.getNum1() + " " + com1.getNum2());
        System.out.println(com2.getNum1() + " " + com2.getNum2());
    }
}
