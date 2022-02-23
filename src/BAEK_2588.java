import java.util.Scanner;

public class BAEK_2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int a = A*(B - B/10*10); //B의 일의 자리 구하기
        int b = A*(B/10 - B/100*10); //B의 십의 자리 구하기
        int c = A*(B/100); //B의 백의 자리 구하기

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a + 10*b + 100*c);
    }
}
