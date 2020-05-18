
/*알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.

한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오. */
import java.io.*;

public class PrintTenChar {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        br.close();

        for (int i = 0; i < line.length(); ++i) {
            bw.write(line.charAt(i));
            if (i % 10 == 9)
                bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}