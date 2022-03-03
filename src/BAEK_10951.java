import java.util.Scanner;

public class BAEK_10951 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = 1;
        int B = 1;

        while(in.hasNextInt()){
            A = in.nextInt();
            B = in.nextInt();
            System.out.println(A + B);
        }
    }
}
