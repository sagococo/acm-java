import java.util.Arrays;
import java.util.Scanner;

public class 题目1044三个字符串的排序 {
    public static void main(String[] args) {
        int n = 3;
        String[] arr = new String[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i < arr.length; i++){
            arr[i] = scanner.nextLine();
        }

        Arrays.sort(arr);
        for (String s : arr){
            System.out.println(s);
        }
    }
}
