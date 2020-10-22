import java.util.Scanner;

public class 题目1018有规律的数列求和 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] fib = new int[n+1];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        float sum = 0;

        for (int i = 1; i <= n; i++){
            sum += fib[i]*1.0/fib[i-1];
        }

        System.out.println(String.format("%.2f", sum));
    }
}
