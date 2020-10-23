import java.util.Scanner;

public class 题目1058求偶数和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum  = 0;
        for (int i = 0;i<n; i++){
            int t = scanner.nextInt();
            if ((t&1) == 0){
                sum+=t;
            }
        }

        System.out.println(sum);
    }
}
