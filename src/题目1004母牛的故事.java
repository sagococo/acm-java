import java.util.Scanner;

public class 题目1004母牛的故事 {
    public static void main(String[] args) {
        int[] arr = new int[56];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        for (int i = 5;i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-3];
        }

        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNext() && (n = scanner.nextInt()) != 0){
            System.out.println(arr[n]);
        }
    }
}
