package boj.boj0209;

import java.util.Scanner;

public class Boj9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            System.out.print(input.charAt(0));
            System.out.println(input.charAt(input.length()-1));
        }
    }
}
