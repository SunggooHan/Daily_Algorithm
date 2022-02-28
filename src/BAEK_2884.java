import java.util.Scanner;

public class BAEK_2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        if(B < 45) {
            A--;		// 시(hour) 1 감소
            B= 60 - (45 - B); 	// 분(min) 감소
            if(A < 0) {
                A = 23;
            }
            System.out.println(A + " " + B);
        }
        else
            System.out.println(A + " " + (B - 45));
    }
}
