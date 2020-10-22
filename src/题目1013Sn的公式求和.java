import java.util.Scanner;

public class 题目1013Sn的公式求和 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += (Math.pow(10, i)-1)/9*2;
        }

        System.out.println(sum);
    }
}
