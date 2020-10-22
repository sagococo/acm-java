import java.util.Scanner;

public class 题目1009数字的处理与判断 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder(n+"");
        System.out.println(sb.length());
        StringBuilder s = new StringBuilder();
        for (int i = 0;i < sb.length(); i++){
            s.append(sb.charAt(i));
            s.append(" ");
        }
        System.out.println(s.toString().trim());
        System.out.println(sb.reverse());
    }
}
