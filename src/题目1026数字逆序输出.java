import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 题目1026数字逆序输出 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i = n-1;i >=0; i--){
            System.out.println(arr[i]);
        }
    }
}
