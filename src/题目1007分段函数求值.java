import java.util.Scanner;

public class 题目1007分段函数求值 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        if (x < 1) System.out.println(x);
        else if(x < 10) System.out.println(2*x-1 );
        else System.out.println(3*x-11);
    }
}
