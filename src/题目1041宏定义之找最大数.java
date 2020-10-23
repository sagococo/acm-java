import java.util.Scanner;

public class 题目1041宏定义之找最大数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        if (b > a) a = b;
        if (c > a) a = c;
        System.out.println(String.format("%.3f", a));
        System.out.println(String.format("%.3f", a));
    }
}
