
import java.util.LinkedList;
import java.util.Map;
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


public class TopView {

    public static Node buildTree(int[] arr, int n) {
        return solve(arr, n, 0);
    }

    public static Node solve(int[] arr, int n, int i) {

        if (i >= n || arr[i] == -1) {
            return null;
        }

        Node root = new Node(arr[i]);

        root.left = solve(arr, n, 2 * i + 1);
        root.right = solve(arr, n, 2 * i + 2);

        return root;
    }

    public static void top(Node root) {

        if(root == null) return;

        Map<Integer,Integer> mpp = new TreeMap<>();

        Queue<Node> q = new LinkedList<>();

        Queue<Integer> qCol = new LinkedList<>();

        q.add(root);
        qCol.add(0);

        while(!q.isEmpty()){

            Node temp = q.poll();
            int col = qCol.poll();

            mpp.putIfAbsent(col,temp.data);

            if(temp.left != null){
                q.add(temp.left);
                qCol.add(col-1);
            }

            if(temp.right != null){
                q.add(temp.right);
                qCol.add(col+1);
            }
        }

        for(var it: mpp.values()){
            System.out.print(it+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 6};

        int n = arr.length;

        Node root = buildTree(arr, n);

       top(root);


    }
}
