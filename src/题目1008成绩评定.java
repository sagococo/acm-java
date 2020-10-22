import java.util.Scanner;

public class 题目1008成绩评定 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        if (x > 100) System.out.println();
        else if (x >= 90) System.out.println("A");
        else if (x >= 80) System.out.println("B");
        else if (x >= 70) System.out.println("C");
        else if (x >= 60) System.out.println("D");
        else System.out.println("E");
    }
}
