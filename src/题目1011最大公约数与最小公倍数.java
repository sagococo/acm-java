import java.util.Scanner;

public class 题目1011最大公约数与最小公倍数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        int gcd = gcd(a, b);

        System.out.println(gcd);
        System.out.println(a*b/gcd);
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b, a%b);
    }

}
