import java.util.Scanner;

public class 题目1072汽水瓶 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNext() && (n = scanner.nextInt())!=0){
            int sum = 0;
            while (n >= 3){
                int change = n/3;
                n = n - change*2;
                sum+= change;
            }

            if (n == 2) sum++;
            System.out.println(sum);
        }
    }
}
