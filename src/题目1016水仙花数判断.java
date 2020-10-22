public class 题目1016水仙花数判断 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++){
            int sum = 0;
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;

            sum = ge*ge*ge + shi*shi*shi + bai*bai*bai;
            if(i == sum) System.out.println(i);
        }
    }
}
