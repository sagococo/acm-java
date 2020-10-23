import java.util.Scanner;

public class 题目1075台球碰撞 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int L = scanner.nextInt();
            int W = scanner.nextInt();
            double x = scanner.nextInt();
            double y = scanner.nextInt();
            int R = scanner.nextInt();
            int alpha = scanner.nextInt();
            int v = scanner.nextInt();
            double s = scanner.nextInt();

            if (L==0){
                break;
            }

            double left = R;
            double right = L-R;
            double bottom = R;
            double top = W-R;

            double v_x = v*Math.cos(Math.toRadians(alpha));
            double v_y = v*Math.sin(Math.toRadians(alpha));

            double start_x, start_y;

            if (v_x > 0) start_x = x-left;
            else start_x = right-left+right-x;

            start_x = start_x + Math.abs(v_x*s);
            start_x = start_x%(2*(right-left));

            if (start_x > (right - left)){
                start_x = 2*(right-left) - start_x;
            }

            if (v_y >0) start_y = y-bottom;
            else start_y = top-bottom+top-y;

            start_y = start_y + Math.abs(v_y*s);
            start_y = start_y%(2*(top-bottom));

            if (start_y > (top - bottom)){
                start_y = 2*(top-bottom) - start_y;
            }

            System.out.println(String.format("%.2f %.2f", start_x+R, start_y+R));
        }

    }
}
