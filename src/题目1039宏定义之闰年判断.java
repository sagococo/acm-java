import java.util.Scanner;

public class 题目1039宏定义之闰年判断 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if ((n%100!=0 && n%4==0) || (n%100==0 && n%400==0)){
            System.out.println("L");
        }else {
            System.out.println("N");
        }
    }
}
