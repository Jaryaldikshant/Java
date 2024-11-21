
class Node {

    int d;
    Node left;
    Node right;

    public Node(int d) {
        this.d = d;
        left = right = null;
    }
}

public class Ceil {

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

        if (val < root.d) {
            root.left = solve(root.left, val); 
        }else if (val > root.d) {
            root.right = solve(root.right, val);
        }

        return root;

    }

    public int ceil(Node root, int key) {

        if (root == null) {
            return -1;
        }

        // If the current node's value equals the key
        if (root.d == key) {
            return root.d;
        }

        // If the key is smaller than the current node's value
        if (key < root.d) {
            // Look for a smaller or equal value in the left subtree
            int leftCeil = ceil(root.left, key);
            return (leftCeil >= key) ? leftCeil : root.d;
        }

        // If the key is greater, search in the right subtree
        return ceil(root.right, key);

    }

    public static void main(String[] args) {
        Ceil bst = new Ceil();

        int[] arr = {10, 5, 15, 3, 7, 12, 18};

        Node root = bst.buildTree(arr);

        int ans = bst.ceil(root, 10);

        System.out.println(ans);
    }
}
