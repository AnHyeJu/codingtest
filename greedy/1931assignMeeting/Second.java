import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Second {
    public static void main(String[] args) throws Exception {
        // 변수 받아 올때 버퍼를 이용하면 좋다던데...? ㅋㅋㅋㅋ
        // 일단 파일 받아오기
        File fileName = new File("data.txt");

        // 원래는 이렇게 받아야
        // BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        // Meeting [] 으로 생성한다면? --> 시간은 늘고 메모리는 조금 준다! 49196kb->48012kb, 652ms -> 680ms
        ArrayList<Meeting> meetings = new ArrayList<Meeting>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings.add(new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        br.close();
        System.out.println(maxMeeting(N, meetings));
    }

    public static int maxMeeting(int N, ArrayList<Meeting> meetings) {
        meetings.sort((o1, o2) -> {
            if (o1.end == o2.end)
                return Integer.compare(o1.start, o2.start);
            else
                return Integer.compare(o1.end, o2.end);
        });

        int cnt = 0;
        int end = 0;
        for (Meeting m : meetings) {
            if (end <= m.start) {
                end = m.end;
                cnt++;
            }
        }
        return cnt;
    }
}

class Meeting {
    int start;
    int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}