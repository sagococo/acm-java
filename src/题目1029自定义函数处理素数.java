import java.util.Scanner;

public class 题目1029自定义函数处理素数 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        if (prime(n)){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }

    private static boolean prime(int n) {

        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n%i == 0) return false;
        }
        return true;
    }
}
