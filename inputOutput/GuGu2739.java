import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*입력 들어오면 그숫자에 해당하는 구구단 출력 */
public class GuGu2739 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < 10; i++)
            bw.write(N + " * " + i + " = " + (N * i) + "\n");
        bw.flush();
        bw.close();
    }
}