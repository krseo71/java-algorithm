package boj.boj0209;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        char[] charArray = a.toCharArray();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for (char c : charArray) {
            arr[c-'a'] = a.indexOf(c);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
