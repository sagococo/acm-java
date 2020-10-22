import java.util.Scanner;

public class 题目1024矩阵对角线求和 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        for (int i = 0;i < 3; i++){
            for (int j = 0;j < 3; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(matrix[0][0]+matrix[1][1]+matrix[2][2]);
        System.out.println(matrix[0][2]+matrix[1][1]+matrix[2][0]);
    }
}
