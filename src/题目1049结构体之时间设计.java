import java.util.Scanner;

public class 题目1049结构体之时间设计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;
        for (int i = 1;i < month; i++){
            sum += days[i];
        }

        sum+=day;

        if (month > 2 && ((year%100!=0 && year%4==0) || (year%100==0 && year%400==0))){
            sum++;
        }

        System.out.println(sum);
    }
}
