package algorithm.second;

import java.util.Scanner;

public class FindRank {
    public void solution(int n, int[] arr) {
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {

        }

    }
    public static void main(String[] args) {
        FindRank T = new FindRank();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.solution(n, arr);

    }
}
