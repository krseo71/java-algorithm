package boj.boj0210;

import java.util.Scanner;

public class Boj25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double point = 0;
        double total = 0;
        int cnt = 0;
        for (int i = 0; i < 20; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            String grade = arr[2];
            if (grade.equals("P")) {
                continue;
            }
            double p = Double.parseDouble(arr[1]);
            total += p;
            switch (grade) {
                case "A+":
                    point += 4.5 * p;
                    break;
                case "A0":
                    point += 4.0 * p;
                    break;
                case "B+":
                    point += 3.5 * p;
                    break;
                case "B0":
                    point += 3.0 * p;
                    break;
                case "C+":
                    point += 2.5 * p;
                    break;
                case "C0":
                    point += 2.0 * p;
                    break;
                case "D+":
                    point += 1.5 * p;
                    break;
                case "D0":
                    point += 1.0 * p;
                    break;
                case "F":
                    point += 0.0;
                    break;
                default:
                    break;

            }

        }
        System.out.printf("%.6f", point/total);
    }
}
