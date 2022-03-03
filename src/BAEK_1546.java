import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEK_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double arr[] = new double[Integer.parseInt(br.readLine())];
        StringTokenizer token = new StringTokenizer(br.readLine()," ");

        double sum = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(token.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            sum = sum + ((arr[i] / arr[arr.length - 1]) * 100);
        }

        double avg = sum / arr.length;

        System.out.println(avg);
    }
}
