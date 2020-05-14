
/*
문제
길이가 N인 수열이 주어졌을 때, 그 수열의 합을 구하려고 한다. 하지만, 그냥 그 수열의 합을 모두 더해서 구하는 것이 아니라, 수열의 두 수를 묶으려고 한다. 어떤 수를 묶으려고 할 때, 위치에 상관없이 묶을 수 있다. 하지만, 같은 위치에 있는 수(자기 자신)를 묶는 것은 불가능하다. 그리고 어떤 수를 묶게 되면, 수열의 합을 구할 때 묶은 수는 서로 곱한 후에 더한다.

예를 들면, 어떤 수열이 {0, 1, 2, 4, 3, 5}일 때, 그냥 이 수열의 합을 구하면 0+1+2+4+3+5 = 15이다. 하지만, 2와 3을 묶고, 4와 5를 묶게 되면, 0+1+(2*3)+(4*5) = 27이 되어 최대가 된다.

수열의 모든 수는 단 한번만 묶거나, 아니면 묶지 않아야한다.

수열이 주어졌을 때, 수열의 각 수를 적절히 묶었을 때, 그 합이 최대가 되게 하는 프로그램을 작성하시오.

입력
첫째 줄에 수열의 크기 N이 주어진다. N은 10,000보다 작다. 둘째 줄부터 N개의 줄에, 수열의 각 수가 주어진다. 수열의 수는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

출력
수를 합이 최대가 나오게 묶었을 때 합을 출력한다. 정답은 항상 2^31보다 작다.

음수와 양수 홀,짝
0,1 유무 정도를 생각해야 하지 않을까?

이거는 어레이가 메모리는 8KB많았고 속도는 4ms 빨랐다?
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class GroupUsingArray {
    public static void main(String args[]) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File data = new File("data.txt");
        BufferedReader br = new BufferedReader(new FileReader(data));

        int N = Integer.parseInt(br.readLine());
        int haveOne = 0, negative = 0, positive = 0;
        int nums[] = new int[N];
        int maxGroup = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 1)
                positive++;
            if (num == 1)
                haveOne++;
            if (num < 1)
                negative++;
            nums[i] = num;
        }
        br.close();
        Arrays.sort(nums);

        // 음수 부분
        for (int i = 0; i < negative - 1; i += 2)
            maxGroup += nums[i] * nums[i + 1];
        if (negative % 2 == 1)
            maxGroup += nums[negative - 1];

        // 양수 부분
        for (int i = nums.length - 1; i > nums.length - positive; i -= 2)
            maxGroup += nums[i] * nums[i - 1];
        if (positive % 2 == 1)
            maxGroup += nums[nums.length - positive];

        // 1더해주고 출력
        System.out.println(maxGroup + haveOne);
    }
}