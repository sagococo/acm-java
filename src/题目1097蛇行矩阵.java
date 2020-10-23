import java.util.Scanner;

public class 题目1097蛇行矩阵 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=1;//记录每行第一个数
        int counter=n;//记录每行个数
        for(int i=1;i<=5;i++) {
            int t=0;
            f=f+i-1;//每行数等于上一行的行数+上一行首元素
            t=f;
            System.out.print(f+" ");
            for(int j=1;j<counter;j++) {
                t=t+j+i;//每行的元素值
                System.out.print(t+" ");
            }
            counter--;//每行元素值减1
            System.out.println();
        }
    }
}
