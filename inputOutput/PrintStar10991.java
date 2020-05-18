import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintStar10991 {
    /*
     * 넒은 트리 별찍기?
     */
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++)
                bw.write(" ");
            for (int k = 0; k < i; k++)
                bw.write("* ");
            bw.write("*\n");
        }
        bw.flush();
        bw.close();
    }
}