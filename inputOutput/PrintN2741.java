import java.util.Scanner;
import java.io.*;

/*자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
와 스케너랑 속도 차이가 이렇게 난다?
Scanner -> 34744KB 696ms
Buffered -> 27328KB 208ms
*/
class PrintN2741 {
    public static void main(String args[]) throws Exception {
    }

    public static void doWithScanner() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i < N + 1; i++)
            System.out.println(i);
    }

    public static void doWithBuffered() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < N + 1; i++)
            bw.write(i + "\n");
        bw.flush();
        bw.close();
    }
}