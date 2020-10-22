import java.util.Scanner;

public class 题目1000简单的ab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a + b;
            System.out.println(c);
        }
    }
}
