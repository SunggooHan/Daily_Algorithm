import java.io.*;
import java.util.StringTokenizer;

public class BAEK_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        StringTokenizer token;

        for(int i = 0; i < n; i++){
            token = new StringTokenizer(in.readLine(), " ");
            out.write((Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken()))+ "\n");;
        }

        in.close();

        out.flush();
        out.close();
    }
}
