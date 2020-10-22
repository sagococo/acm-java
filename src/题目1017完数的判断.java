import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class 题目1017完数的判断 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 2;i <= n;i++){
            LinkedList<Integer> factors = new LinkedList<>();
            int sum  = 1;
            factors.add(1);
            for (int k = 2; k < Math.sqrt(i); k++){
                if (i%k == 0){
                    sum += k;
                    sum += i/k;

                    factors.add(k);
                    factors.add(i/k);
                }
            }
            if (sum == i){
                StringBuilder ans = new StringBuilder();
                ans.append(i);
                ans.append(" its factors are");
                factors.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1-o2;
                    }
                });

                for (int t : factors){
                    ans.append(" ");
                    ans.append(t);
                }
                System.out.println(ans);
            }
        }
    }
}
