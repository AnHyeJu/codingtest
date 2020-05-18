import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintStar2441 {
    /*
     * 별찍기 역순 오른 정렬
     */
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = N; i > 0; i--) {
            for (int k = N; k > i; k--)
                bw.write(" ");
            for (int j = 1; j <= i; j++)
                bw.write("*");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}