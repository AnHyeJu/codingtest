
/*
문제
준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

출력
첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.

액수가 큰 동전부터 채운 뒤 나머지는 1원짜리 동전들로 채우자!

처음엔 스케너로 했다가 버퍼드 리더와 인풋스트림리더, 토큰을 사용하니까 
메모리 14268KB -> 12976KB
시간  104ms -> 80ms

놀라워!
*/
import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bs.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        int count = 0;

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(bs.readLine());
        }

        for (int i = N - 1; i >= 0 && K > 0; i--) {
            if (K >= coins[i]) {
                count += K / coins[i];
                K %= coins[i];
            }
        }
        System.out.println(count);
    }
}