package algorithm.sixth;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParenthesesString {
    public static void main(String[] args) {
        RemoveParenthesesString T = new RemoveParenthesesString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }
        for (char x : stack) {
            answer += x;
        }
        return answer;
    }

}
