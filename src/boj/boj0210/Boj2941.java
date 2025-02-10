package boj.boj0210;

import java.util.Scanner;

public class Boj2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] croatian = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for (String c : croatian) {
            s = s.replace(c, "X"); // 크로아티아 알파벳을 1글자로 치환
        }

        System.out.println(s.length()); // 변환된 문자열의 길이 = 크로아티아 알파벳 개수
    }
}
