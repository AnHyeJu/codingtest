import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintStar2445 {
    /*
     * 별찍기 데칼코마니?
     */
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        StringBuffer first = new StringBuffer();
        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= N * 2; j++) {
                if (j <= i || j > N * 2 - i) {
                    first.append("*");
                } else {
                    first.append(" ");
                }
            }
            first.append("\n");
        }
        StringBuffer last = new StringBuffer(first);
        for (int i = 0; i < N * 2; i++)
            first.append("*");

        first.append(last.reverse());
        bw.write(first.toString());
        bw.flush();
        bw.close();
    }
}