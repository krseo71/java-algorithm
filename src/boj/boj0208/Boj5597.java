package boj.boj0208;

import java.util.Scanner;

public class Boj5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];

        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            arr[a] = a;
        }

        for (int i = 1; i < 31; i++) {
            if (arr[i] == 0) System.out.println(i);
        }
    }
}
