import java.util.Scanner;

public class 题目1042电报加密 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < str.length(); i++){
            char c = str.charAt(i);
            if ('a'<=c && c<='z'){
                sb.append((char)((c-'a'+1)%26+'a'));
            }else if('A'<=c && c<='Z'){
                sb.append((char)((c-'A'+1)%26+'A'));
            }else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
