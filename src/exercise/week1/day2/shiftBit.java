package exercise.week1.day2;

import java.util.Scanner;

public class shiftBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = scanner.nextInt();
        System.out.print("비트 수 입력: ");
        int n = scanner.nextInt();

        // 주어진 숫자를 2진수로 출력
        printBinary(num);

        // Ensure n is within bounds

        for (int i = 0; i < n; i++) {
            if (num > 0) {
                if ((num & 1) == 0) {
                    num = num >> 1;
                } else {
                	num = num >> 1;
                    num = num | 0x80000000;
                }
            } else {
                if ((num & 1) == 1) {
                    num = num >> 1;
                } else {
                	num = num >> 1;
                    num = num & 0x7fffffff; //음수 사용시 &
                }
            }
        }
        
        // Print the binary representation
        printBinary(num);
    }

    private static void printBinary(int num) {
        int check = 0x80000000;

        for (int i = 0; i < 32; i++) {
            if ((num & check) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            check = check >>> 1;
        }
        System.out.println();
    }
}
