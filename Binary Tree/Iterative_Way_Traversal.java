
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class Pair {

    Node node;
    int num;

    public Pair(Node node, int num) {
        this.node = node;
        this.num = num;
    }
}

public class Iterative_Way_Traversal {

    public static Node buildTree(int[] arr, int n) {
        return solve(arr, n, 0);
    }

    public static Node solve(int[] arr, int n, int i) {

        if (i >= n) {
            return null;
        }

        Node root = new Node(arr[i]);

        root.left = solve(arr, n, 2 * i + 1);
        root.right = solve(arr, n, 2 * i + 2);

        return root;
    }

    public static void Iterative_Approch(Node root) {

        Stack<Pair> st = new Stack<Pair>();

        st.push(new Pair(root, 1));

        List<Integer> preList = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();
        List<Integer> postList = new ArrayList<>();

        if (root == null) {
            return;
        }

        while (!st.isEmpty()) {

            Pair temp = st.pop(); // here it contains two values in pair (1). is node and (2). is num acc to pair class

            // if num == 1
            // add this to pre part
            // increment num from 1 to 2
            // push to the left side of tree
            if (temp.num == 1) {
                preList.add(temp.node.data);
                temp.num ++;
                st.push(temp);

                if (temp.node.left != null) {
                    st.push(new Pair(temp.node.left, 1));
                }
            }

            // if num == 2
            // add this to pre part
            // increment num from 2 to 3
            // push to the rightt side of tree
            else if (temp.num == 2) {
                inList.add(temp.node.data);
                temp.num ++;
                st.push(temp);
                if (temp.node.right != null) {
                    st.push(new Pair(temp.node.right, 1));
                }
            } 
            
            else {
                postList.add(temp.node.data);

            }
        }

        System.out.println("Preorder Traversal: " + preList);
        System.out.println("Inorder Traversal: " + inList);
        System.out.println("Postorder Traversal: " + postList);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        Node root = buildTree(arr, n);

        Iterative_Approch(root);

    }
}
