package algorithm.eighth;

public class BinaryOutput {
    public void DFS(int n) {
        if (n == 0) return;

        DFS(n / 2);
        System.out.print(n % 2 + " ");
    }

    public static void main(String[] args) {
        BinaryOutput T = new BinaryOutput();
        T.DFS(11);
    }
}
