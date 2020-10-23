import java.util.Scanner;

public class 题目1047报数问题 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int p = 0;

        for (int i = 2; i <= n; i++){
            p = (p+3)%i;
        }

        System.out.println(p+1);
    }
}
