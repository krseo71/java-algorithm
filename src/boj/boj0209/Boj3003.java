package boj.boj0209;

import java.util.Scanner;

public class Boj3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            arr[i] = arr[i] - sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
