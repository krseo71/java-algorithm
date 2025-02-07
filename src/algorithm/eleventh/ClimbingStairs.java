package algorithm.eleventh;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
    static int[] arr;

    public int solution(int n) {
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }
    public static void main(String[] args) {

        ClimbingStairs T = new ClimbingStairs();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        arr = new int[n+1];

        System.out.println(T.solution(n));
    }
}
