import java.util.Scanner;

public class 题目1057分段函数 {
    public static void main(String[] args) {
        float x = new Scanner(System.in).nextFloat();
        float ans;
        if (x < 1) ans=x;
        else if(x < 10) ans=2*x-1;
        else ans=3*x-11;

        System.out.println(String.format("%.2f", ans));
    }
}
