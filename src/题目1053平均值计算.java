import java.util.Scanner;

public class 题目1053平均值计算 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0;i <n; i++){
            arr[i] = scanner.nextInt();
            sum+=arr[i];
        }

        int count = 0;
        for (int i : arr){
            if (i*n > sum) count++;
        }

        System.out.println(count);
    }
}
