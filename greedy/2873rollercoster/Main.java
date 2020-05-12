
/*
문제
상근이는 우리나라에서 가장 유명한 놀이 공원을 운영하고 있다. 이 놀이 공원은 야외에 있고, 다양한 롤러코스터가 많이 있다.

어느 날 벤치에 앉아있던 상근이는 커다란 황금을 발견한 기분이 들었다. 자신의 눈 앞에 보이는 이 부지를 구매해서 롤러코스터를 만든다면, 세상에서 가장 재미있는 롤러코스터를 만들 수 있다고 생각했다.

이 부지는 직사각형 모양이고, 상근이는 R행 C열의 표 모양으로 나누었다. 롤러코스터는 가장 왼쪽 위 칸에서 시작할 것이고, 가장 오른쪽 아래 칸에서 도착할 것이다. 롤러코스터는 현재 있는 칸과 위, 아래, 왼쪽, 오른쪽으로 인접한 칸으로 이동할 수 있다. 각 칸은 한 번 방문할 수 있고, 방문하지 않은 칸이 있어도 된다.

각 칸에는 그 칸을 지나갈 때, 탑승자가 얻을 수 있는 기쁨을 나타낸 숫자가 적혀있다. 롤러코스터를 탄 사람이 얻을 수 있는 기쁨은 지나간 칸의 기쁨의 합이다. 가장 큰 기쁨을 주는 롤러코스터는 어떻게 움직여야 하는지를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 R과 C가 주어진다. (2 ≤ R, C ≤ 1000) 둘째 줄부터 R개 줄에는 각 칸을 지나갈 때 얻을 수 있는 기쁨이 주어진다. 이 값은 1000보다 작은 양의 정수이다.

출력
첫째 줄에 가장 가장 큰 기쁨을 주는 롤러코스터는 가장 왼쪽 위 칸부터 가장 오른쪽 아래 칸으로 어떻게 움직이면 되는지를 출력한다. 위는 U, 오른쪽은 R, 왼쪽은 L, 아래는 D로 출력한다. 정답은 여러 가지 일 수도 있다.

큰값을 선택해서 가는거 인줄알았는데 그건 또 아님.. 최대한 많이 갈 수 있는곳으로 가는것?
사실 그리디 문제를 몇 풀어도 그리디 개념을 충족하는지 잘 모르겠담.,,

1. RC 둘 중 하나가 홀 일때는 전체를 갈 수 있음
2. 둘다 짝수인경우 체스판을 생각해보고 RC모두 흰 칸이라 했을때 흰>검>흰>검>흰 순으로 이동되니까 검은색 하나가 빠져야끝가지 갈 수 있음. 그 검은색은 검은칸들중 최솟값이여야겠지?
3.그럼 둘다 짝수일 때 경로를 어떻게 해결할 것이냐? R,C 에서부터 각각 두사람이 출발한다고 생각하고 최소 검은칸 전에,, 후에? 멈출것

아 내가 잘못해서 복잡하게 하고있는건지 뭔지
ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
*/
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        File data = new File("data.txt");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(data));
        StringTokenizer RC = new StringTokenizer(br.readLine());
        int matrix[] = { Integer.parseInt(RC.nextToken()), Integer.parseInt(RC.nextToken()) };
        StringBuffer ans = new StringBuffer();

        char[] dirH = { 'R', 'L', 'D' };
        char[] dirV = { 'D', 'U', 'R' };
        if (matrix[0] % 2 == 1) {
            appendLine(ans, matrix, dirH);
        } else if (matrix[1] % 2 == 1) {
            int[] remat = { matrix[1], matrix[0] };
            appendLine(ans, remat, dirV);
        } else {// RC 둘다 짝수
            // minBlack은 인덱스고 !!! matrix는 크기인거 잊지말것...!!
            // 검은칸 최솟값 찾기
            int minBlack[] = { 0, 1 };
            int tmpMin = 0;
            for (int i = 0; i < matrix[0]; i++) {
                StringTokenizer line = new StringTokenizer(br.readLine());
                for (int j = 0; j < matrix[1]; j++) {
                    int tmp = Integer.parseInt(line.nextToken());
                    if (i == 0 && j == 1)
                        tmpMin = tmp;
                    if ((i + j) % 2 == 1 && tmpMin > tmp) {
                        tmpMin = tmp;
                        minBlack[0] = i;
                        minBlack[1] = j;
                    }
                }
            }

            // 최솟값 찾았으니 최솟값 있는 행 전행까지 진행
            if (minBlack[0] > 1) {
                int upper[] = { minBlack[0] / 2 * 2, matrix[1] };
                appendLine(ans, upper, dirH);
            }
            // 끝에서부터 시작하는 부분도
            StringBuffer ans2 = new StringBuffer();
            if (matrix[0] - (minBlack[0] + 1) > 1) {
                int lower[] = { (matrix[0] - (minBlack[0] + 1)) / 2 * 2, matrix[1] };
                appendLine(ans2, lower, dirH);
            }

            // 이제 최소 흑칸을 포함한 2줄
            // 시작부분부터...
            for (int i = 0; i < minBlack[1]; i++) {
                if (i % 2 == 0)
                    ans.append("DR");
                else
                    ans.append("UR");
            }

            if (matrix[1] > (minBlack[1] + 1)) {
                if (minBlack[1] % 2 == 0)
                    ans.append("RD");
                else
                    ans.append("RU");
            }

            for (int i = 0; i < matrix[1] - minBlack[1] - 2; i++) {
                if (i % 2 == 0)
                    ans2.append("DR");
                else
                    ans2.append("UR");
            }
            ans.append(ans2.reverse());
        }

        System.out.println(ans.toString());

        br.close();
    }

    // 한줄 생성
    public static void append(StringBuffer sb, char c, int n) {
        for (int i = 0; i < n; i++)
            sb.append(c);
    }

    // 여러줄 생성
    public static void appendLine(StringBuffer sb, int[] matrix, char[] dir) {
        for (int i = 0; i < matrix[0]; i++) {
            if (i % 2 == 0) {
                append(sb, dir[0], matrix[1] - 1);
                if (i != matrix[0] - 1)
                    append(sb, dir[2], 1);
            } else {
                append(sb, dir[1], matrix[1] - 1);
                append(sb, dir[2], 1);
            }
        }
    }

}
