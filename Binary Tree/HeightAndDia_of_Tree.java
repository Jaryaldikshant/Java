
class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class HD {

    int height;
    int diameter;

    public HD(int h, int d) {
        height = h;
        diameter = d;
    }
}




public class HeightAndDia_of_Tree {


    public static HD HeightAndDia(Node root){

    if(root == null) return new HD(0,0);

    HD left = HeightAndDia(root.left);
    HD right = HeightAndDia(root.right);

    int rootDia = left.height + right.height + 1;

    int dia = Math.max(rootDia, Math.max(left.diameter,right.diameter));

    int height = Math.max(left.height, right.height)+1;

    return new HD(height, dia);

}

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

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 6};
        int n = arr.length;

        Node root = buildTree(arr, n);

        HD ans = HeightAndDia(root);

        System.out.println("Height of Tree: " + ans.height);

        System.out.println("Diameter of Tree: " + ans.diameter);
        

    }
}
