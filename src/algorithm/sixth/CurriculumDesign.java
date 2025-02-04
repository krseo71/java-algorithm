package algorithm.sixth;

import java.util.LinkedList;
import java.util.Scanner;

public class CurriculumDesign {
    public static void main(String[] args) {
        CurriculumDesign T = new CurriculumDesign();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();

        System.out.println(T.solution(a, b));
    }

    private String solution(String need, String plan) {
        String answer = "YES";
        LinkedList<Character> queue = new LinkedList<>();
        for (char x: need.toCharArray()) {
            queue.offer(x);
        }
        for (char x: plan.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            return "NO";
        }
        return answer;
    }
}
