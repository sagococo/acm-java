import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 题目1099校门外的树 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][2];

        for (int i = 0;i < arr.length; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        int sum = l+1;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int start = -1, end = -2;

        for (int i = 0;i <arr.length; i++){
            if (arr[i][0] > end){
                sum -= end-start+1;
                start = arr[i][0];
                end = arr[i][1];
            }else {
                end = Math.max(arr[i][1], end);
            }
        }

        sum -= end-start+1;
        System.out.println(sum);
    }
}
