import java.util.Scanner;

public class 题目1050结构体之成绩记录 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String[] strings = new String[n];
        for (int i = 0;i < strings.length; i++){
            strings[i] = scanner.nextLine().trim().replace(" ", ",");
        }

        for (String s : strings){
            System.out.println(s);
        }
    }
}
