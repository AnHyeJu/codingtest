import java.io.*;

//말그대로 입력한 그대로 출력하기지만 11718과 다른점은
//각 줄의 앞 뒤에 공백이 있을 수도 있다.는점
//다르게 해보았다..
class JustPrint11719 {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = null;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}