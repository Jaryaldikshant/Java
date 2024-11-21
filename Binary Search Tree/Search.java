
class Node {

    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }

}

public class Search {

    public Node buildTree(int[] arr) {

        Node root = null;
        for (int val : arr) {
            root = solve(root, val);
        }
        return root;
    }

    public Node solve(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = solve(root.left, val);
        } else if (val > root.data) {
            root.right = solve(root.right, val);
        }

        return root;
    }

    public void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public Node searching(Node root, int val) {

        while (root != null && root.data != val) {
            root = val < root.data ? root.left : root.right;
        }
        return root;
    }

    public static void main(String[] args) {

        Search bst = new Search();

        int[] arr = {10, 5, 15, 3, 7, 12, 18};

        Node root = bst.buildTree(arr);

        bst.inorder(root);

        System.out.println();

        Node ans = bst.searching(root, 15);

        if (ans != null) {
            System.out.println("Value found");
        } else {
            System.out.println("Value not found");
        }

    }
}
