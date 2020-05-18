import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintStar10992 {
    /*
     * 넒은 트리 별찍기?
     */
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++)
                bw.write(" ");
            if (i != 0)
                bw.write("*");
            for (int k = 0; k < 2 * i - 1; k++)
                bw.write(" ");
            bw.write("*\n");
        }
        for (int i = 0; i < N * 2 - 1; i++)
            bw.write("*");
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}