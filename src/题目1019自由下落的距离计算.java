import java.util.Scanner;

public class 题目1019自由下落的距离计算 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextFloat();
        double n = scanner.nextFloat();

        double sum  = -m;

        double high = 0;

        for (int i = 0;i < n; i++){
            high = m/2.0;
            sum += m*2.0;
            m = m/2.0;
        }

        System.out.println(String.format("%.2f", high));
        System.out.println(String.format("%.2f", sum));
    }
}
