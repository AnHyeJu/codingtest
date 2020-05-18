import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MinMax10818 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = min;

        for (int i = 0; i < N - 1; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            min = min > tmp ? tmp : min;
            max = max < tmp ? tmp : max;
        }
        br.close();
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}