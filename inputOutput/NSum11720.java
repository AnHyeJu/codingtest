import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NSum11720 {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(in.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int n = Character.getNumericValue(in.read());
            sum += n;
        }
        System.out.println(sum);
    }
}