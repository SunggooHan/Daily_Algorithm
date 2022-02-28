import java.util.Scanner;

public class BAEK_2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B;
        for(B = 1; B < 10; B++){
            System.out.println(A + " * " + B + " = " + A*B);
        }
    }
}
