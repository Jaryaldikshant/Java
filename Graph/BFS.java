
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[v + 1];
        Queue<Integer> q = new LinkedList<>();

        q.add(1);

        vis[1] = true;

        while (!q.isEmpty()) {

            Integer node = q.poll();
            bfs.add(node);

            for (Integer it : adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {

        int vertices = 9;

        // Create adjacency list for the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= vertices; i++) {
            adj.add(new ArrayList<>());
        }

        int[][] edges = {
            {1, 2}, {1, 6}, {2, 3}, {2, 4}, {4, 5}, {5, 8},
            {6, 7}, {6, 9}, {7, 8}
        };

        // Add edges to the adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // Since the graph is undirected
        }

        BFS bfs = new BFS();

        ArrayList<Integer> result = bfs.bfs(vertices, adj);

        // Print BFS traversal
        System.out.println("BFS Traversal:");
        System.out.println(result);

    }
}
