import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintStar2438 {
    /*
     * 별찍기 i,j다 0으로 해도 되는데 왜 1로했지?ㅋ 근데 이게 더 빨랐다? 뭐지 아.. 그냥 그때그때 다른가봐 채점할때마다?
     */
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++)
                bw.write("*");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}