package day2;
import java.util.Scanner;

public class revsqueeze{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열과 삭제할 문자를 적으시오");

        System.out.print("문자열: ");
        String s = sc.nextLine();

        System.out.print("삭제할 문자: ");
        char c = sc.next().charAt(0);

        String result = revsqueeze(s, c);
        System.out.println(result);
    }

    //for
    private static String revsqueeze(String s, char c) {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != c) {
                temp.append(ch);
            }
        }

        temp.reverse();

        return temp.toString();
    }

    //while
    /*private static String revsqueeze(String s, char c) {
        StringBuilder temp = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch != c) {
                temp.append(ch);
            }
            i++;
        }

        temp.reverse();

        return temp.toString();
    }*/

    //foreach
    /*private static String revsqueeze(String s, char c) {
        StringBuilder temp = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != c) {
                temp.append(ch);
            }
        }
        temp.reverse();

        return temp.toString();
    }*/
}

//문자열 s에서 문자 c를 제거하고 역변환
//String s = "abcabc"; char c ='a';