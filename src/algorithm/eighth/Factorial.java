package algorithm.eighth;

public class Factorial {
    public static void main(String[] args) {
        Factorial T = new Factorial();
        System.out.println(T.DFS(5));
    }

    private int DFS(int n) {
        if (n == 1) return 1;
        return n * DFS(n - 1);
    }
}
