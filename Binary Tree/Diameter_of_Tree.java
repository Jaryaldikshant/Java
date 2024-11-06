
class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Diameter_of_Tree {

    static int max;

    static int height(Node root) {

        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        max = Math.max(max, left + right);

        return 1 + Math.max(left, right);

    }

    static int diameter(Node root) {
        max = 0;
        height(root);
        return max;

    }

    static Node buildTree(int[] arr, int n) {
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

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 6};

        int n = arr.length;

        Node root = buildTree(arr, n);

        int ans = diameter(root);

        System.out.println("Diameter of Binary Tree: " + ans);

    }
}
