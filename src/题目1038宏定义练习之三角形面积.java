import java.util.Scanner;

public class 题目1038宏定义练习之三角形面积 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double S = (a+b+c)/2.0;
        double area = Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println(String.format("%.3f", area));
    }
}
