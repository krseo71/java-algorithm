package boj.boj0208;

import java.util.Scanner;

public class Boj10810 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            while (a <= b) {
                arr[a] = c;
                a++;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
