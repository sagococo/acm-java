import java.util.Scanner;

public class 题目1006三个数找最大值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (b > a) a = b;
        if (c > a) a = c;
        System.out.println(a);
    }
}
