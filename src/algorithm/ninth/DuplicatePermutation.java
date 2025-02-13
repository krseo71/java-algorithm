package algorithm.ninth;

import java.util.Scanner;

public class DuplicatePermutation {
    static int[] pm;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int x: pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        DuplicatePermutation T = new DuplicatePermutation();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
