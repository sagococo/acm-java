import java.util.Scanner;

public class 题目1012字符串分类统计 {
    public static void main(String[] args) {
        String string = new Scanner(System.in).nextLine();
        int alphabet = 0;
        int number = 0;
        int space = 0;
        int others = 0;

        for (int i = 0;i < string.length(); i++){
            char current = string.charAt(i);
            if (('a' <= current && current <= 'z') || ('A' <= current && current <= 'Z')) alphabet++;
            else if ('0' <= current && current <= '9') number++;
            else if (current == ' ') space++;
            else others++;
        }

        System.out.println(alphabet);
        System.out.println(number);
        System.out.println(space);
        System.out.println(others);
    }
}
