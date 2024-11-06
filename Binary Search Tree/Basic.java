
class Node {

    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

public class Basic {

    public Node buildTree(int[] arr) {

        Node root = null;
        for (int val : arr) {
            root = insert(root, val);
        }
        return root;
    }

    public Node insert(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } 
        
        else if (val > root.data) {
            root.right = insert(root.right, val);
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

    public static void main(String[] args) {

        Basic bst = new Basic();

        int[] arr = {10, 5, 15, 3, 7, 12, 18};

        Node root = bst.buildTree(arr);

        System.out.println("Inorder traversal of the constructed BST:");
        bst.inorder(root);
    }
}
