import java.util.Scanner;

public class 题目1015求和训练 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        float sum = 0;
        for (int i = 1; i <= a; i++){
            sum += i;
        }

        for (int i = 1; i <= b; i++){
            sum += i*i;
        }

        for (int i = 1; i <= c; i++){
            sum += 1.0/i;
        }

        System.out.println(String.format("%.2f", sum));
    }
}
