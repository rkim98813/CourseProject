package exercise.week1.day3;

import java.util.Scanner;

class InvalidException extends Exception {
    public InvalidException(String message) {
        super(message);
    }
}

public class exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String inputString = scanner.nextLine();

        System.out.print("시작 인덱스 (a) 입력: ");
        int startIndex = scanner.nextInt();

        System.out.print("길이 (b) 입력: ");
        int length = scanner.nextInt();

        try {
            String result = midstr(inputString, startIndex, length);
            System.out.println("결과: " + result);
        } catch (InvalidException e) {
            System.err.println("오류: " + e.getMessage());
        }
    }

    public static String midstr(String s, int a, int b) throws InvalidException { //가변 매개변수 사용
        if (a < 1 || b < 1) {
            throw new InvalidException("잘못된 매개변수: a 및 b는 1 이상으로 하라");
        }

        if (a > s.length()) {
            throw new InvalidException("잘못된 매개변수: 시작 인덱스 (a)가 범위 밖");
        }

        return s.substring(a - 1, a - 1 + b);

        /*try {
            // 시작 인덱스 'a'에서 길이 'b'로부터 하위 문자열 추출
            return s.substring(a - 1, a - 1 + b);
        } catch (StringIndexOutOfBoundsException e) {
            throw new InvalidException("잘못된 매개변수: 하위 문자열 추출 실패");
        }*/
    }
}
