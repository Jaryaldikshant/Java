
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

public class RightView {

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

    public static List<Integer> right(Node root) {

        List<Integer> lt = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {

                Node temp = q.poll();

                if (i == size - 1) {
                    lt.add(temp.data);
                }

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        return lt;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 6};

        int n = arr.length;

        Node root = buildTree(arr, n);

        List<Integer> ans = right(root);
        System.out.println(ans);

    }
}
