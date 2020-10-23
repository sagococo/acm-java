import java.util.Scanner;

public class 题目1040实数的打印 {
    public static void main(String[] args) {
        float n = new Scanner(System.in).nextFloat();
        String out = String.format("%6.2f", n);
        StringBuilder sb = new StringBuilder();
        sb.append(out);
        sb.append("\n");
        sb.append(out);
        sb.append(" ");
        sb.append(out);
        sb.append("\n");
        sb.append(out);
        sb.append(" ");
        sb.append(out);
        sb.append(" ");
        sb.append(out);
        System.out.println(sb.toString());
    }
}
