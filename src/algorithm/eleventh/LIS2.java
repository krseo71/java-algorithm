package algorithm.eleventh;

import java.util.Scanner;

public class LIS2 {
    static int dy[];

    public int solution(int[] arr) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        LIS2 T = new LIS2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
