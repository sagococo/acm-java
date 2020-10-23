import java.math.BigInteger;

public class 题目1064阶乘数列 {
    public static void main(String[] args) {
        int n = 30;
        BigInteger sum = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;
        for (int i = 1; i <= n ;i++){
            current = current.multiply(BigInteger.valueOf(i));
            sum = sum.add(current);
        }
        BigInteger s = new BigInteger(sum+"");
        System.out.println(String.format("%.2e", s.doubleValue()));
    }
}