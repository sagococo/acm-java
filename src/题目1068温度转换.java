public class 题目1068温度转换 {
    public static void main(String[] args) {
        for(int i = -100; i <= 150; i+=5){
            System.out.println(String.format("c=%d->f=%d", i, 32+i*9/5));
        }
    }
}
