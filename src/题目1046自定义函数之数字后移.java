import java.util.Scanner;

public class 题目1046自定义函数之数字后移 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int shift = scanner.nextInt();
        shift = n-shift;

        int count=0;
        while (count < n){
            System.out.print(arr[shift%n]);
            System.out.print(" ");
            shift++;
            count++;
        }
    }
}
