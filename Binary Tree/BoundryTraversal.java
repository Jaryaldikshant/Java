
import java.util.ArrayList;

class Node {

    int d;
    Node left;
    Node right;

    public Node(int d) {
        this.d = d;
        left = right = null;
    }
}

public class BoundryTraversal {

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

    static void LeftPart(Node root, ArrayList<Integer> ans) {
    
    Node curr = root.left;

    while (curr != null){

        if(isLeaf(curr) == false) ans.add(curr.d);
        
        if(curr.left != null) curr = curr.left;

        else curr = curr.right;
    }
}

    static void LeafNodes(Node root, ArrayList<Integer> ans) {

        if(isLeaf(root)){
            ans.add(root.d);
            return;
        }

        if(root.left != null) LeafNodes(root.left, ans);

        if(root.right != null) LeafNodes(root.right, ans);


        
    }

    static void RightPart(Node root, ArrayList<Integer> ans) {

        Node temp = root.right;

        ArrayList<Integer> res = new ArrayList<>();

        while(temp != null){

            if(isLeaf(temp) == false) res.add(temp.d);

            if(temp.right != null) temp = temp.right;

            else{
                temp = temp.left;
            }
        }

        for(int i = res.size()-1; i>=0; i--){
            ans.add(res.get(i));
        }


    }

    static boolean isLeaf(Node root){

        return (root.left == null && root.right == null);

    }

    static ArrayList<Integer> printBoundry(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if(isLeaf(root) == false) ans.add(root.d);

        LeftPart(root, ans);
        LeafNodes(root, ans);
        RightPart(root, ans);

        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {10,5,20,3,8,18,25,-1,-1,7,-1,-1,-1,-1,-1,-1,-1};

        int n = arr.length;

        Node root = buildTree(arr, n);

        ArrayList<Integer> result = printBoundry(root);

        System.out.println(result);
        

    }
}
