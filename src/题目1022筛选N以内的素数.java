import java.util.Scanner;

public class 题目1022筛选N以内的素数 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n+1];

        for (int i = 2; i < arr.length; i++){
            if (arr[i] == 0){
                for (int k = 2; k*i < arr.length; k++){
                    arr[i*k] = 1;
                }
            }
        }

        for (int i =2 ; i < arr.length; i++){
            if (arr[i] == 0){
                System.out.println(i);
            }
        }
    }
}
