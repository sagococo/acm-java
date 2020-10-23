import java.util.Scanner;

public class 题目1067分段函数 {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();

        double ans;
        if (x < 0) ans = -x;
        else if (x < 2) ans = Math.sqrt(x+1);
        else if (x < 4) ans = Math.pow(x+2, 5);
        else ans = 2*x+5;

        System.out.println(String.format("%.2f", ans));
    }
}
