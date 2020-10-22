import java.util.Scanner;

public class 题目1010利润计算 {
    public static void main(String[] args) {
        int w = 10000;
        int x = new Scanner(System.in).nextInt();
        int profit = 0;
        if (x > 100000){
            profit += 100000*0.1;
        }else {
            profit += x*0.1;
            System.out.println(profit);
            return;
        }

        if (x > 200000){
            profit += 100000*0.075;
        }else {
            profit += (x - 100000) * 0.075;
            System.out.println(profit);
            return;
        }

        if (x > 400000){
            profit += 200000*0.05;
        }else {
            profit += (x - 200000) * 0.05;
            System.out.println(profit);
            return;
        }

        if (x > 600000){
            profit += 200000*0.03;
        }else {
            profit += (x - 400000) * 0.03;
            System.out.println(profit);
            return;
        }

        if (x > 10000000){
            profit += 400000*0.015;
            profit += (x- 1000000)*0.01;
        }else {
            profit += (x - 600000) * 0.015;
        }
        System.out.println(profit);
    }
}
