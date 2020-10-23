import java.util.Scanner;

public class 题目1084用筛法求之N内的素数 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 2; i <= n; i++){
            boolean flag = true;
            for (int k = 2; k<= Math.sqrt(i);k++){
                if (i%k == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }
    }
}
