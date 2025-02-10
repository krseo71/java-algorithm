package boj.boj0209;

import java.util.Scanner;

public class Boj2908 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String[] aSplit = a.split("");
        String[] bSplit = b.split("");

        int lt = 0, rt = a.length()-1;
        String tmp = "";
        while (lt < rt) {
            tmp = aSplit[lt];
            aSplit[lt] = aSplit[rt];
            aSplit[rt] = tmp;
            tmp = bSplit[lt];
            bSplit[lt] = bSplit[rt];
            bSplit[rt] = tmp;
            lt++;
            rt--;
        }
        String k = "";
        for (String s : aSplit) {
            k += s;
        }
        String j = "";
        for (String s : bSplit) {
            j += s;
        }
        System.out.println(Math.max(Integer.parseInt(k), Integer.parseInt(j)));

    }
}
