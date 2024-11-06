
class TreeNode {

    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class LCA {

    public static TreeNode buildTree(int[] arr, int n, int i) {
        if (i >= n || arr[i] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(arr[i]);
        root.left = buildTree(arr, n, 2 * i + 1);
        root.right = buildTree(arr, n, 2 * i + 2);

        return root;
    }

    public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

  
    public static TreeNode findNode(TreeNode root, int value) {

        if (root == null) {
            return null;
        }

        if (root.data == value) {
            return root;
        }

        TreeNode left = findNode(root.left, value);

        TreeNode right = findNode(root.right,value);

        return (left != null) ? left : right ;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 6, 7};
        int n = arr.length;
        int pValue = 4;
        int qValue = 5;

        TreeNode root = buildTree(arr, n, 0);

        TreeNode p = findNode(root, pValue);
        TreeNode q = findNode(root, qValue);

        if (p != null && q != null) {

            TreeNode lca = findLCA(root, p, q);

            System.out.println("LCA of " + pValue + " and " + qValue + " is: " + (lca != null ? lca.data : "Not found"));

        } else {
            System.out.println("One or both of the specified nodes do not exist in the tree.");
        }

    }
}
