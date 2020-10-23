import java.util.Scanner;

public class 题目1098陶陶摘苹果 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];

        for (int i  =0 ;i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int h = scanner.nextInt();

        int count = 0;
        for (int i : arr){
            if(30+h >= i) count++;
        }
        System.out.println(count);
    }
}
