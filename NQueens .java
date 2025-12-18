public class NQueens {

    static void solve(int row, int n, boolean[] col, boolean[] d1, boolean[] d2) {
        if (row == n) {
            System.out.println("Solution Found");
            return;
        }
        for (int c = 0; c < n; c++) {
            if (!col[c] && !d1[row - c + n - 1] && !d2[row + c]) {
                col[c] = d1[row - c + n - 1] = d2[row + c] = true;
                solve(row + 1, n, col, d1, d2);
                col[c] = d1[row - c + n - 1] = d2[row + c] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        solve(0, n, new boolean[n], new boolean[2*n], new boolean[2*n]);
    }
}
