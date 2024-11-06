
class Node {

    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

public class AllTraversal {

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

    static void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        Node root = buildTree(arr, n);

        System.out.println("Pre-Order: ");
        preOrder(root);
        System.out.println();

        System.out.println("In-Order: ");
        inOrder(root);
        System.out.println();

        System.out.println("Post-Order: ");
        postOrder(root);
        System.out.println();

    }
}
