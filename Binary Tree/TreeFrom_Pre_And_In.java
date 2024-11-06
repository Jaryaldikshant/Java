
import java.util.HashMap;
import java.util.Map;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeFrom_Pre_And_In {


    public Node solve1(int[] preOrder, int[] inOrder) {

        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < inOrder.length; i++) {
            mpp.put(inOrder[i], i);
        }

        Node root = solve2(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1, mpp);

        return root;

    }

    public static Node solve2(int[] preOrder, int preSt, int preEnd, int[] inOrder, int inSt, int inEnd, Map<Integer, Integer> mpp) {

        if (preSt > preEnd || inSt > inEnd) {
            return null;
        }

        Node root = new Node(preOrder[preSt]);

        int inRoot = mpp.get(root.data);

        int num = inRoot - inSt;

        root.left = solve2(preOrder, preSt + 1, preSt + num, inOrder, inSt, inRoot - 1, mpp);

        root.right = solve2(preOrder, preSt + num + 1, preEnd, inOrder, inRoot + 1, inEnd, mpp);

        return root;

    }

    public void printInOrder(Node root) {

        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);

    }

    public static void main(String[] args) {
        TreeFrom_Pre_And_In tree = new TreeFrom_Pre_And_In();

        int[] preOrder = {1, 2, 4, 5, 3, 6}; 

        int[] inOrder = {4, 2, 5, 1, 3, 6};

        Node root = tree.solve1(preOrder,inOrder);


        tree.printInOrder(root);




    }
}
