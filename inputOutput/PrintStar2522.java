import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintStar2522 {
    /*
     * 별찍기 다른거
     */
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < 2 * N; i++) {
            if (i <= N) {
                for (int j = 1; j < N + 1; j++) {
                    if (j <= N - i)
                        bw.write(" ");
                    else
                        bw.write("*");
                }
            } else {
                for (int k = 1; k < N + 1; k++) {
                    if (k > i - N)
                        bw.write("*");
                    else
                        bw.write(" ");
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}