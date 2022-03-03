import java.util.Scanner;

public class BAEK_10952 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = 1;
        int B = 1;

        while(A != 0 && B != 0){
            A = in.nextInt();
            B = in.nextInt();
            if(A + B != 0) {
                System.out.println(A + B);
            }
        }
    }
}
