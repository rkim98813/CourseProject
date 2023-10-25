package lesson;

import java.util.Scanner;

public class accountTest {
    public static void main(String[] args) {
        int input;
        long balance;
        Scanner c = new Scanner(System.in);
        accounts a = new accounts();

        System.out.println("원하는 거래 선택");
        System.out.println("[1] 입금 (DEPOSIT)");
        System.out.println("[2] 출금 (WITHDRAW)");
        input = c.nextInt();

        if (input == 1 || input == 2) {
            System.out.print("금액 입력: ");
            balance = c.nextLong();

            if (input == 1) {
                a.deposit(balance);
            } else {
                a.withdraw(balance);
            }
        } else {
            System.out.println("잘못 선택 하셨습니다.");
        }
    }
}

class accounts {
    private long balance = 0L;

    public void deposit(long mo) {
        balance += mo;
        System.out.println("입금 후 balance: " + balance);
    }

    public void withdraw(long mo) {
        if (mo <= balance) {
            balance -= mo;
            System.out.println("출금 후 balance: " + balance);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
