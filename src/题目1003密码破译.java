import java.util.Scanner;

public class 题目1003密码破译 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < input.length(); i++){
            sb.append((char)(input.charAt(i)+4));
        }
        System.out.println(sb);
    }
}
