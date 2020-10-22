import java.util.Scanner;

public class 题目1021迭代法求平方根 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        float right = 0;
        while (right*right < x) right++;

        float left = right-1;

        float last = 0;

        while (true){
            float mid = (left+right)/2;
            if (Math.abs(mid-last) <0.00001){
                System.out.println(String.format("%.3f", mid));
                return;
            }
            last = mid;
            if (mid*mid > x) right = mid;
            else left = mid;
        }
    }
}
