import java.util.Scanner;

public class 题目1028自定义函数求一元二次方程 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int delta = b*b-4*a*c;
        if (delta > 0) greater(a, b, delta);
        if (delta == 0) equals(a, b);
        if (delta < 0) less(a, b, delta);
    }

    private static void equals(int a, int b) {
        double x = -b/2.0/a;
        System.out.println(String.format("x=%.3f", x));
    }
    private static void greater(int a, int b, int delta) {
        double x1 = (-b+Math.sqrt(delta))/2.0/a;
        double x2 = (-b-Math.sqrt(delta))/2.0/a;
        System.out.println(String.format("x1=%.3f x2=%.3f", x1, x2));

    }
    private static void less(int a, int b, int delta) {
        double p1 = -b/2.0/a;
        double p2 = Math.sqrt(-delta)/2.0/a;
        System.out.println(String.format("x1=%.3f+%.3fi x2=%.3f-%.3fi", p1, p2, p1, p2));
    }
}
