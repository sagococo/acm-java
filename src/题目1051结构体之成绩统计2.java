import java.util.Scanner;

public class 题目1051结构体之成绩统计2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum_first = 0, sum_second = 0, sum_third = 0;
        String num = "", name = "";
        int  first = 0, second = 0, third = 0, sum = -1;
        for (int i = 0;i < n ; i++){
            String nu = scanner.next();
            String na = scanner.next();
            int f = scanner.nextInt();
            int s = scanner.nextInt();
            int t = scanner.nextInt();

            sum_first+=f;
            sum_second+=s;
            sum_third+=t;

            if (f+s+t > sum){
                num = nu;
                name = na;
                first = f;
                second = s;
                third = t;
                sum = f+s+t;
            }

        }
        System.out.println(String.format("%d %d %d", sum_first/n, sum_second/n, sum_third/n));
        System.out.println(String.format("%s %s %d %d %d", num, name, first, second, third));
    }
}
