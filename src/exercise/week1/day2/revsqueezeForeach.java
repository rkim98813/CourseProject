package exercise.week1.day2;
import java.util.Scanner;

public class revsqueezeForeach{
    public static void main(String[] args) {
        System.out.println("문자열과 삭제할 문자를 적으시오");
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열: ");
        String s = sc.nextLine();

        System.out.print("삭제할 문자: ");
        char c = sc.next().charAt(0);

        String result = revsqueeze(s, c);
        System.out.println(result);
    }

    private static String revsqueeze(String s, char c) {
        StringBuilder temp = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != c) {
                temp.append(ch);
            }
        }
        temp.reverse();

        return temp.toString();
    }
}
