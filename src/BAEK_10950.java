import java.util.Scanner;

public class BAEK_10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int A;
        int B;

        for(int i = 0; i < T; i++) {
            A = in.nextInt();
            B = in.nextInt();
            System.out.println(A + B);
        }
    }
}
