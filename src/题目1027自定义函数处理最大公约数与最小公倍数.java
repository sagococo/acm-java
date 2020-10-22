import java.util.Scanner;

public class 题目1027自定义函数处理最大公约数与最小公倍数 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
