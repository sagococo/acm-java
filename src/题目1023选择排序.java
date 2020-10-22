import java.util.Scanner;

public class 题目1023选择排序 {
    public static void main(String[] args) {

        int n  =10;

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[n];

        for (int i = 0;i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i = 0;i < arr.length;i++){
            int index = i;
            for (int k=i+1; k<n; k++){
                if (arr[k] < arr[index]){
                    index = k;
                }
            }

            System.out.println(arr[index]);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
