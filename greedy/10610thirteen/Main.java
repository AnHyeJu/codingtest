/*
문제
어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.

미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.

입력
N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.

출력
미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.

3의배수가 되는 조건
10의 배수가 되는 조건
을 만족하는 가장 큰 수를  구하면 된다
*/

import java.util.*;

class Main {
    public static String findMostBigMultiOf30(String num) {
        int sum = 0;
        int nums[] = new int[10];
        StringBuffer ans = new StringBuffer();

        for (int i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - '0';
            sum += n;
            nums[n]++;
        }

        if (nums[0] != 0 && sum % 3 == 0) {
            for (int i = 9; i >= 0; i--) {
                for (int j = 0; j < nums[i]; j++) {
                    ans.append(i);
                }
            }
            return ans.toString();
        } else
            return "-1";
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        System.out.println(findMostBigMultiOf30(num));
    }
}