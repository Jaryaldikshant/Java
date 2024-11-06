
import java.util.LinkedList;
import java.util.Queue;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

public class OddLevel {

    static Node buildTree(int[] arr, int n) {
        return solve(arr, n, 0);
    }

    static Node solve(int[] arr, int n, int i) {

        if (i >= n) {
            return null;
        }

        Node node = new Node(arr[i]);

        node.left = solve(arr, n, 2 * i + 1);
        node.right = solve(arr, n, 2 * i + 2);

        return node;
    }

    static void LevelOrder(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {

                Node temp = q.poll();
                System.out.print(temp.data + " ");

                if (temp.left != null) {
                    q.offer(temp.left);
                }

                if (temp.right != null) {
                    q.offer(temp.right);
                }

            }
            System.out.println();
        }

    }

    static void OddLevelOrder(Node root) {
        
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        int lvl = 1;

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i<size; i++){

                Node temp = q.poll();

                if(lvl%2 != 0){
                    System.out.print(temp.data+" ");
                }

                if(temp.left != null) q.offer(temp.left);

                if(temp.right != null) q.offer(temp.right);

            }
            lvl++;
        }

    }

  

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        Node root = buildTree(arr, n);

        System.out.println("Level Order Traversal: ");
        LevelOrder(root);
        System.out.println();

        System.out.println("Odd Level Order Traversal: ");
        OddLevelOrder(root);
        System.out.println();

    }
}
