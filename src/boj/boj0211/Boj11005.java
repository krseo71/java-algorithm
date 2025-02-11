package boj.boj0211;

import java.util.Scanner;

public class Boj11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (a > 0) {
            int i = a%b;
            if (i < 10) {
                sb.append(i);
            } else {
                sb.append((char)('A' + (i - 10)));
            }
            a = a/b;
        }
        System.out.println(sb.reverse());

    }
}
