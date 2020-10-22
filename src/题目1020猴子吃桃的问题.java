import java.util.Scanner;

public class 题目1020猴子吃桃的问题 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(find(n));
    }

    public static int find(int t){
        if (t == 1) return 1;
        else return (find(t-1)+1)*2;
    }
}
