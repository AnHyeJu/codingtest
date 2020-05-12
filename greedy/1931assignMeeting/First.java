import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

class First {
    public static void main(String args[]) throws Exception {
        File data = new File("data.txt");
        if (data.exists()) {
            Scanner sc = new Scanner(data);
            int N = sc.nextInt();
            int[][] timeTable = new int[N][2];

            for (int i = 0; i < N; i++) {
                timeTable[i][0] = sc.nextInt();
                timeTable[i][1] = sc.nextInt();
            }

            sc.close();

            System.out.println(maxMeeting(N, timeTable));
        }
    }

    public static int maxMeeting(int N, int[][] timeTable) {
        Arrays.sort(timeTable, (o1, o2) -> {
            if (o1[1] == o2[1])
                return Integer.compare(o1[0], o2[0]);
            else
                return Integer.compare(o1[1], o2[1]);
        });

        int cnt = 1;
        int endTime = timeTable[0][1];

        for (int i = 1; i < N; i++) {
            if (endTime <= timeTable[i][0]) {
                endTime = timeTable[i][1];
                cnt++;
            }
        }
        return cnt;
    }
}