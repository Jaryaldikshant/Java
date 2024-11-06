


class Node{

    int data;
    Node left;
    Node right;

    public Node(int d){
        data = d;
        left = null;
        right = null;
    }

}


public class BuildTree{

    
    static Node build(int[] arr, int n){
        return solve(arr,n,0);
    }

    static Node solve(int [] arr, int n, int i){


        if(i >= n){
            return null;
        }

        Node node = new Node(arr[i]);

        node.left = solve(arr,n,2*i+1);
        node.right = solve(arr,n,2*i+2);

        return node;
    }

    public static void preOrder(Node root){

        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
       

        int arr[] = {1,2,3,4,5,6,7};

        int n = arr.length;

        Node root = build(arr,n);

        System.out.print("Pre-Order Traversal: ");

        preOrder(root);

    }
}
