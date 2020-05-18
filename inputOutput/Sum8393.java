import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum8393 {
    /* n이 주어졌을때 1부터 n의 합 */
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(sumsum(n));
    }

    public static int sumsum(int n) {
        if (n == 1)
            return 1;
        return n + sumsum(n - 1);
    }
}