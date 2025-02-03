package algorithm.sixth;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {

    public static void main(String[] args) {
        IronBar T = new IronBar();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    private int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char tmp = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }
}
