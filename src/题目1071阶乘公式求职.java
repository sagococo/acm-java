import java.util.Scanner;

public class 题目1071阶乘公式求职 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        double[] arr = new double[n+1];
        arr[1] = 1;
        for (int i = 2;i < arr.length; i++){
            arr[i] = arr[i-1]*i;
        }

        double sum  = 0;
        for (int i = 1; i <= n; i++){
            sum+=1.0/arr[i];
        }
        System.out.println(String.format("sum=%.5f", sum));
    }
}
