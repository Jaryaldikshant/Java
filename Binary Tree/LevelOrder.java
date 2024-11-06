
import java.util.LinkedList;
import java.util.Queue;

class Node {

    int d;
    Node left;
    Node right;

    public Node(int d) {
        this.d = d;
        left = right = null;
    }
}

public class LevelOrder {

    static Node BuildTree(int[] arr, int n) {
        return solve(arr, n, 0);
    }

    static Node solve(int[] arr, int n, int i) {

        if (i >= n) {
            return null;
        }

        Node root = new Node(arr[i]);

        root.left = solve(arr, n, 2 * i + 1);
        root.right = solve(arr, n, 2 * i + 2);

        return root;
    }

    static void LevelOrder(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                System.out.print(temp.d + " ");

                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
            System.out.println();  // Move to the next level

        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int n = arr.length;

        Node root = BuildTree(arr, n);

        System.out.println("Level_Order: ");
        LevelOrder(root);
    }
}
