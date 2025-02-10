package boj.boj0208;

import java.util.Scanner;

public class Boj10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int v = sc.nextInt();
        int cnt = 0;
        for (int i : arr) if (v == i) cnt++;
        System.out.println(cnt);
    }
}
