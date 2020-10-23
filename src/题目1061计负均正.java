import java.util.Scanner;

public class 题目1061计负均正 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count  = 0;
        int sum  =0;

        int n = 20;
        for (int i = 0;i < n; i++){
            int t = scanner.nextInt();
            if (t < 0) count++;
            else sum+=t;
        }

        System.out.println(count);
        System.out.println(String.format("%.2f", sum*1.0/(n-count)));
    }
}
