import java.io.*;

//말그대로 입력한 그대로 출력하기
class JustPrint11718 {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = null;
        while ((line = in.readLine()) != null) {
            out.write(line + "\n");
            out.flush();
        }

        in.close();
        out.close();
    }
}