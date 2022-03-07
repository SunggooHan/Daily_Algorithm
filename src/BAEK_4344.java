import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEK_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;
        int C = Integer.parseInt(br.readLine());
        StringTokenizer token;

        for(int i = 0; i < C; i++){
            token = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(token.nextToken());
            arr = new int[N];

            double sum = 0;

            for(int j = 0; j < N; j++){
                int test = Integer.parseInt(token.nextToken());
                arr[j] = test;
                sum = sum + test;
            }

            double avg = (sum / N);
            double student = 0;

            for(int j = 0; j < N; j ++){
                if(arr[j] > avg){
                    student++;
                }
            }

            System.out.printf("%.3f%%\n", (student / N) * 100);
        }
    }
}
