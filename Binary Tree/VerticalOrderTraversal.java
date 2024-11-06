
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;


class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair{
    Node root;
    int row;
    int col;

    public Pair(Node root, int row, int col){
        this.root = root;
        this.row = row;
        this.col = col;
    }
}

public class VerticalOrderTraversal {

    static Node buildTree(int[] arr, int n) {
        return solve(arr, n, 0);
    }

    static Node solve(int[] arr, int n, int i) {

        if (i >= n || arr[i] == -1) {
            return null;
        }

        Node root = new Node(arr[i]);

        root.left = solve(arr, n, 2 * i + 1);
        root.right = solve(arr, n, 2 * i + 2);

        return root;
    }

    public static List<List<Integer>> solve(Node root){


       TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> mpp = new TreeMap<>();
       Queue<Pair> q = new LinkedList<Pair>();

        q.offer(new Pair(root,0,0));

        while(!q.isEmpty()){

            Pair temp = q.poll();
            Node tempRoot = temp.root;
            int lvl = temp.row;
            int vertical = temp.col;

            if(!mpp.containsKey(lvl)){
                mpp.put(lvl, new TreeMap<>());
            }

            if(!mpp.get(lvl).containsKey(vertical)){
                mpp.get(lvl).put(vertical, new PriorityQueue<>());
            }

            mpp.get(lvl).get(vertical).offer(tempRoot.data);

            if(tempRoot.left != null) q.offer(new Pair(tempRoot.left,lvl-1,vertical+1));

            if(tempRoot.right != null) q.offer(new Pair(tempRoot.right,lvl+1,vertical+1));

        }

        List<List<Integer>>lt = new ArrayList<>();

        for(TreeMap<Integer,PriorityQueue<Integer>> ans: mpp.values()){
            lt.add(new ArrayList<>());

            for(PriorityQueue<Integer> nodes: ans.values()){

                while(!nodes.isEmpty()){
                    // System.out.println(nodes.peek());
                    lt.get(lt.size()-1).add(nodes.poll());
                }
            }
        }
        return lt;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 6};

        int n = arr.length;

        Node root = buildTree(arr, n);

        List<List<Integer>> ans = solve(root);
        System.out.println(ans);

    }
}
