
class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Max_Depth {

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

    static int HeightOfTree(Node root) {

        if (root == null) {
            return -1;
        }

        int left = HeightOfTree(root.left);
        int right = HeightOfTree(root.right);

        return 1 + Math.max(left, right);

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, 7};

        int n = arr.length;

        Node root = buildTree(arr, n);

        int ans = HeightOfTree(root);

        System.out.println("Height of Binary Tree: " + ans);

    }
}
