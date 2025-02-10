package boj.boj0209;

import java.util.Scanner;

public class Boj10988 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        int answer = 1;

        char[] arr = str.toCharArray();
        int lt = 0, rt = arr.length - 1;
        while (lt < rt) {
            if (arr[lt] == arr[rt]) {
                lt++;
                rt--;
            } else {
                answer = 0;
                break;
            }
        }
        System.out.println(answer);
    }
}
