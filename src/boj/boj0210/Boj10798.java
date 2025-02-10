package boj.boj0210;

import java.util.Scanner;

public class Boj10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for (int i = 0; i < arr.length; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
            continue;
        }
        for (int i = 0; i < arr[0].length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if (arr[j][i] == '\0') {
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
    }
}
