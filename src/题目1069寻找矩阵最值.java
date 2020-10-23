import java.util.Scanner;

public class 题目1069寻找矩阵最值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int m = 0;
        int x = 0, y = 0;
        for (int i = 0;i < n; i++){
            for (int j = 0;j < n; j++){
                int t = scanner.nextInt();
                if (Math.abs(t) > max){
                    m = t;
                    max = Math.abs(t);
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(String.format("%d %d %d", m, x+1, y+1));
    }
}
