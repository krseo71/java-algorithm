package algorithm.seventh;

import java.util.Arrays;
import java.util.Scanner;

public class CheckForDuplicates {
    public static void main(String[] args) {
        CheckForDuplicates T = new CheckForDuplicates();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }

    private String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";
            }
        }

        return answer;
    }


}
