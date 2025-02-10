package boj.boj0210;

import java.util.HashMap;
import java.util.Scanner;

public class Boj1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String uc = s.toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < uc.length(); i++) {
            map.put(uc.charAt(i), map.getOrDefault(uc.charAt(i), 0) + 1);
        }
        int max = 0;
        String answer = "";
        for (Character c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                answer = String.valueOf(c);
            } else if (map.get(c).equals(max)) {
                answer = "?";
            }
        }
        return answer;
    }
}
