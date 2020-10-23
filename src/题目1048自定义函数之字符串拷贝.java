import java.util.Scanner;

public class 题目1048自定义函数之字符串拷贝 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        int m = scanner.nextInt();

        System.out.println(str.substring(m-1));
    }
}
