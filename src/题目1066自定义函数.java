import java.util.Scanner;

public class 题目1066自定义函数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        int n = scanner.nextInt();
        long[] arr = new long[n+1];
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i]=arr[i-1]*i;
        }

        float sum = 0;
        for (int i = 1;i <= n; i++){
            sum += Math.pow(-1, i-1)*Math.pow(x, i)/arr[i];
        }
        System.out.println(String.format("%.4f", sum));
    }
}
