package algorithm.sixth;

import java.util.LinkedList;
import java.util.Scanner;

public class SaveThePrincess {
    public static void main(String[] args) {
        SaveThePrincess T = new SaveThePrincess();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.print(T.solution(n, k));
    }

    private int solution(int n, int k) {
        int answer = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }
}
