import java.util.Scanner;

public class 题目1030二维数组的转置 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i < n; i++){
            for (int j = 0;j < n; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0;i < n; i++){
            for (int j = 0;j < n; j++) {
                System.out.println(matrix[j][i]);
            }
        }
    }
}
