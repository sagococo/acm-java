import java.util.Scanner;

public class 题目1045自定义函数之整数处理 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = 0;
        int max_index = arr.length-1;

        for (int i = 0;i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                min_index = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[min_index];
        arr[min_index] = temp;

        for (int i = 0;i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                max_index = i;
            }
        }
        temp = arr[n-1];
        arr[n-1] = arr[max_index];
        arr[max_index] = temp;

        for (int i:arr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
