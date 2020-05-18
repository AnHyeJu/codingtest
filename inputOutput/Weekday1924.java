import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Weekday1924 {
    /*
     * 2007년 1월1일은 월요일 2007년 0월0일의 요일을 구하자
     */
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int mon = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        String weekDay[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        for (int i = 1; i < mon; i++) {
            if (i == 2)
                day += 28;
            else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                day += 31;
            else if (i == 4 || i == 6 || i == 9 || i == 11)
                day += 30;
        }

        bw.write(weekDay[day % 7]);
        bw.flush();
        bw.close();
    }
}