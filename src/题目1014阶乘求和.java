import java.util.Scanner;

public class 题目1014阶乘求和 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        long[] arr = new long[n+1];
        arr[1] =1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1]*i;
        }

        long sum = 0;
        for (int i = 1; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
