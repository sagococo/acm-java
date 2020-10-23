import java.util.Scanner;

public class 题目1065最小绝对值 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0;i < n; i++) {
            arr[i] = scanner.nextInt();
            if (Math.abs(arr[i]) < min){
                min = Math.abs(arr[i]);
                index = i;
            }
        }

        int temp = arr[index];
        arr[index] = arr[n-1];
        arr[n-1] = temp;

        for (int i : arr){
            System.out.println(i);
        }
    }
}
