import java.util.Scanner;
import java.util.Stack;

public class 题目1074数字整除 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num ="";

        while (scanner.hasNext() && !(num = scanner.nextLine()).equals("0")){
            Stack<Integer> stack = new Stack<>();
            for (int i = 0;i < num.length(); i++){
                stack.push(Integer.valueOf(num.charAt(i)-'0'));
            }

            if (stack.size() < 2){
                int i = Integer.valueOf(num);
                if (i%17==0) System.out.println(1);
                else System.out.println(0);
                continue;
            }

            int current = stack.pop()+10*stack.pop();
            while (!stack.isEmpty()){
                if (current < 100 ){
                    current += 100*stack.pop();
                }
                current = current/10 - 5*(current%10);
            }
            if (current%17==0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
