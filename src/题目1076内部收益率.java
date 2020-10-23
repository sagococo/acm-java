import java.util.Scanner;

public class 题目1076内部收益率 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext() && ((n = scanner.nextInt())!=0)){
            int[] arr = new int[n+1];
            for (int i = 0;i < arr.length; i++){
                arr[i] = scanner.nextInt();
            }

            double left = 0;
            double right = 1000;
            double error = 0.00001;

            while (right-left>error){
                double mid = (left+right)/2;
                double sum =0 ;
                for (int i = 0;i < arr.length; i++){
                    sum += arr[i]*1.0/Math.pow(mid, i);
                }
                if (sum > 0) left = mid;
                if (sum < 0) right = mid;
            }

            System.out.println(String.format("%.2f", (left+right)/2.0 - 1));
        }
    }
}
