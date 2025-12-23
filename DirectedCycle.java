import java.util.*;

public class DirectedCycle {
    static boolean dfs(int u, List<List<Integer>> g, int[] vis) {
        if (vis[u] == 1) return true;
        if (vis[u] == 2) return false;

        vis[u] = 1;
        for (int v : g.get(u))
            if (dfs(v, g, vis)) return true;
        vis[u] = 2;
        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        List<List<Integer>> g = new ArrayList<>();
        for (int i=0;i<n;i++) g.add(new ArrayList<>());
        g.get(0).add(1); g.get(1).add(2); g.get(2).add(0);

        int[] vis = new int[n];
        System.out.println(dfs(0, g, vis));
    }
}
