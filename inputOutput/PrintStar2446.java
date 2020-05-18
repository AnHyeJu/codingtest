import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintStar2446 {
    /*
     * 별찍기 모래시계
     */
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = N; i > 0; i--) {
            for (int j = 0; j < N - i; j++)
                bw.write(" ");
            for (int k = 0; k < 2 * i - 1; k++)
                bw.write("*");
            bw.newLine();
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < N - i; j++)
                bw.write(" ");
            for (int k = 0; k < 2 * i - 1; k++)
                bw.write("*");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}