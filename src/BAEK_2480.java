import java.util.Scanner;

public class BAEK_2480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int price;

        if(A == B && B == C) {
            price = 10000 + A * 1000;
            System.out.println(price);
        }
        else if((A == B && B != C) || (B == C && A != C) || (A == C && B != C)){
            if(A == B && B != C)
                price = 1000 + A * 100;
            else if(A == C && B != C)
                price = 1000 + A * 100;
            else
                price = 1000 + B * 100;

            System.out.println(price);
        }
        else{
            if(A > B && A > C)
                price = A * 100;
            else if(B > A && B > C)
                price = B * 100;
            else
                price = C * 100;

            System.out.println(price);
        }
    }
}
