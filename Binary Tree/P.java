
class Node {

    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

public class P {

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

    public static Node Lca(Node root, Node p, Node q) {

        if (root == null || root == p || root == q) {
            return root;
        }

        Node left = Lca(root.left, p, q);
        Node right = Lca(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;

    }

    public static Node findNode(Node root, int value) {

        if (root == null) {
            return null;
        }

        if (root.data == value) {
            return root;
        }

        Node left = findNode(root.left, value);
        Node right = findNode(root.right, value);

        return (left != null) ? left : right;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 6, 7};

        int n = arr.length;

        Node root = buildTree(arr, n);

        int p = 4;
        int q = 5;

        Node pNode = findNode(root, p);
        Node qNode = findNode(root, q);

        if (pNode != null && qNode != null) {

            Node res = Lca(root, pNode, qNode);

            System.out.println(res.data);

        }

    }
}
