import java.util.Scanner;

public class 题目1100采药 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] things = new int[m][2];

        for (int i = 0;i < m ;i++){
            things[i][0] = scanner.nextInt();
            things[i][1] = scanner.nextInt();
        }

        int[] dp = new int[t+1];

        for (int i = 0;i < m; i++){
            int time = things[i][0];
            int value = things[i][1];

            for (int k = dp.length-1; k >= time; k--){
                dp[k] = Math.max(dp[k], dp[k-time]+value);
            }
        }
        System.out.println(dp[t]);
    }

}
