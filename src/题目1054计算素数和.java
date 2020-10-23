import java.util.Scanner;

public class 题目1054计算素数和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum  = 0;

        for (int i=m;i<=n;i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int m) {

        if (m < 2) return false;

        for (int i = 2; i <= Math.sqrt(m); i++){
            if (m%i == 0) return false;
        }
        return true;
    }
}
