import java.util.Scanner;

public class 题目1055进制转换 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String bin = dec2bin(n);
        String oct = bin2oct(bin);

        System.out.println(oct);

    }

    public static String dec2bin(int n){
        StringBuilder sb = new StringBuilder();
        while (n != 0){
            sb.append(n&1);
            n=n>>1;
        }
        return sb.reverse().toString();
    }

    public static String bin2oct(String bin){
        while (bin.length()%3!=0) bin = "0" + bin;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< bin.length()/3; i++){
            String current = bin.substring(i*3, i*3+3);
            int sum = 0;
            if (current.charAt(0) == '1') sum+=4;
            if (current.charAt(1) == '1') sum+=2;
            if (current.charAt(2) == '1') sum+=1;
            sb.append(sum);
        }
        return sb.toString();
    }
}
