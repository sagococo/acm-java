import java.util.Scanner;

public class 题目1025数组插入处理 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 9;
        int[] arr = new int[n];

        for (int i=0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();
        boolean printed = false;

        for (int i = 0;i < arr.length; i++){
            if (arr[i] >= num && !printed) {
                System.out.println(num);
                printed = true;
            }
            System.out.println(arr[i]);
        }
    }
}
