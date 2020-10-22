import java.util.Scanner;

public class 题目1005温度转换 {
    public static void main(String[] args) {
        float f = new Scanner(System.in).nextInt();

        float c = 5*(f-32)/9;

        System.out.println(String.format("c=%.2f", c));
    }
}
