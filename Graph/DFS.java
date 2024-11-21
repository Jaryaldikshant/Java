
import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> lt) {

        vis[v] = true;
        lt.add(v);

        for (Integer it : adj.get(v)) {

            if (!vis[it]) {
                dfs(it, adj, vis, lt);
            }
        }

    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        boolean vis[] = new boolean[adj.size()];
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, adj, vis, ls);

        return ls;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        adj.add(new ArrayList<>(List.of(1, 2)));
        adj.add(new ArrayList<>(List.of(0, 3)));
        adj.add(new ArrayList<>(List.of(0, 4)));
        adj.add(new ArrayList<>(List.of(1)));
        adj.add(new ArrayList<>(List.of(2)));

        DFS dfs = new DFS();
        ArrayList<Integer> result = dfs.dfs(adj);

        System.out.println("DFS Traversal:");
        System.out.println(result);

    }
}
