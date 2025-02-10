package boj.boj0210;

import java.util.Scanner;

public class Boj2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[10][10];
        int max = Integer.MIN_VALUE;
        int n = 1, m = 1;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] > max) {
                    max = board[i][j];
                    n = i;
                    m = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(n + " " + m);
    }
}
