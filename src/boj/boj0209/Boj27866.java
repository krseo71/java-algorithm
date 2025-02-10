package boj.boj0209;

import java.util.Scanner;

public class Boj27866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int a = sc.nextInt();
        System.out.println(arr[a - 1]);
    }
}
