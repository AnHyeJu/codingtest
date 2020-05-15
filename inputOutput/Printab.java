import java.io.*;
import java.util.StringTokenizer;

class Printab {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine());
        for (int i = 1; i < N + 1; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            out.write("Case #" + i + ": " + (A + B) + "\n");
        }
        in.close();
        out.flush();
        out.close();
    }
}