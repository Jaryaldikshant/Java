
class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Balanced_BinaryTree {

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

    static boolean balanced(Node root) {
        return checkHeight(root) != -1;
    }

    static int checkHeight(Node root) {

        if (root == null) {
            return 0;
        }

        int left = checkHeight(root.left);
        if (left == -1) {
            return -1;
        }

        int right = checkHeight(root.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 6};
        int n = arr.length;

        Node root = buildTree(arr, n);

        boolean ans = balanced(root);
        System.out.println(ans);

    }
}
