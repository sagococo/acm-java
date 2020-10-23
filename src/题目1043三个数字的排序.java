import java.util.Arrays;
import java.util.Scanner;

public class 题目1043三个数字的排序 {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = new int[n];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        for (int i : arr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
