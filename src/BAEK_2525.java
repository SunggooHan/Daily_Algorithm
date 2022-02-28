import java.util.Scanner;

public class BAEK_2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        B = B + C;
        if(B >= 60) {
            while(B >= 60) {
                B = B - 60;
                A++;
                if(A >= 24) {
                    A = 0;
                }
            }
        }
        System.out.println(A +" "+ B);
    }
}
