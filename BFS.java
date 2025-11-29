import java.util.*;

public class BFS {
    public static void main(String[] args){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList());
        graph.put(4, Arrays.asList());

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[5];

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node + " ");

            for(int nbr : graph.get(node)){
                if(!visited[nbr]){
                    visited[nbr] = true;
                    q.add(nbr);
                }
            }
        }
    }
}
