package algorithm.ninth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExchangeCoin {
    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) return;
        if (L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        ExchangeCoin T = new ExchangeCoin();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for (int i =0; i<n; i++) arr[i] = kb.nextInt();
        m = kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        T.DFS(0, 0, arr);
        System.out.println(answer);

    }
}
