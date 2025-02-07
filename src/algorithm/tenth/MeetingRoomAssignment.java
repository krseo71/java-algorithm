package algorithm.tenth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time1 implements Comparable<Time1>{
    public int s, e;
    public Time1(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time1 o) {
        if (this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }
}

public class MeetingRoomAssignment {

    public int solution(ArrayList<Time1> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for (Time1 ob : arr) {
            if (ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        MeetingRoomAssignment T = new MeetingRoomAssignment();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Time1> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Time1(x, y));
        }
        System.out.println(T.solution(arr, n));

    }
}
