import java.util.Scanner;

public class BAEK_11021 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int A, B;
        int sum;

        for(int i = 1; i <= T; i++){
            A = in.nextInt();
            B = in.nextInt();
            sum = A + B;
            System.out.println("Case #" + i + ": " + sum);
        }
    }
}
