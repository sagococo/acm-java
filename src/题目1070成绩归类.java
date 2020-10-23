import java.util.Scanner;

public class 题目1070成绩归类 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int A =0;
        int B = 0;
        int C = 0;
        while (scanner.hasNext() && (score = scanner.nextInt()) > 0){
            if (score >= 85) A++;
            else if (score >= 60) B++;
            else C++;
        }

        System.out.println(String.format(">=85:%d", A));
        System.out.println(String.format("60-84:%d", B));
        System.out.println(String.format("<60:%d", C));
    }
}
