import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 题目1052链表合并 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt() + scanner.nextInt();

        int[][] id_score = new int[n][2];
        for (int i = 0;i < n; i++){
            id_score[i][0] = scanner.nextInt();
            id_score[i][1] = scanner.nextInt();
        }

        Arrays.sort(id_score, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int[] pair : id_score){
            System.out.println(String.format("%d %d", pair[0], pair[1]));
        }
    }
}
