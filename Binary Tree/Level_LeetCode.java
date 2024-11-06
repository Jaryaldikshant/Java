// https://leetcode.com/problems/binary-tree-level-order-traversal/



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {

//         Queue<TreeNode> q = new LinkedList<TreeNode>();
//         List<List<Integer>> lt = new LinkedList<List<Integer>>();

//         if(root == null) return lt;

//         q.offer(root);

//         while(!q.isEmpty()){
//             int size = q.size();

//             List<Integer> sublt = new LinkedList<Integer>();

//             for(int i = 0 ;i <size; i++){
//                 if(q.peek().left != null) {
//                     q.offer(q.peek().left);
//                 }

//                 if(q.peek().right != null){
//                     q.offer(q.peek().right);
//                 }

//                 sublt.add(q.poll().val);
//             }
//             lt.add(sublt);
//         }
//         return lt;
//     }
// }