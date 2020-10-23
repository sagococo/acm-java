import java.util.Scanner;

public class 题目1073弟弟的作业 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNext()){
            String problem = scanner.nextLine();
            String c_str = problem.split("=")[1];
            if (c_str.equals("?")) continue;
            String split_op;
            if (problem.contains("+")) split_op = "\\+";
            else split_op = "-";
            int a = Integer.valueOf(problem.split("=")[0].split(split_op)[0]);
            int b = Integer.valueOf(problem.split("=")[0].split(split_op)[1]);
            int c = Integer.valueOf(c_str);

            if (split_op.equals("\\+") && a+b == c) count++;
            if (split_op.equals("-") && a-b == c) count++;
        }

        scanner.close();
        System.out.println(count);
    }
}
