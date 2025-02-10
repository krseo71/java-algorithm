package boj.boj0210;

import java.util.*;

public class Boj1316 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어 개수
        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (check(str)) {
                count++;
            }
        }
        System.out.println(count);

    }

    private static boolean check(String str) {
        boolean[] ch = new boolean[26];
        char prev = str.charAt(0);
        ch[prev - 'a'] = true;

        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);

            if (prev != cur && ch[cur - 'a']) {
                return false;
            }
            ch[cur - 'a'] = true;
            prev = cur;
        }

        return true;
    }
}
