import java.util.Scanner;

public class 题目1033自定义函数之字符提取 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < str.length(); i++){
            char c = str.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                    c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
