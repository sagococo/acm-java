import java.util.Scanner;

public class 题目1034自定义函数之数字分离 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < str.length(); i++){
            sb.append(str.charAt(i));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
