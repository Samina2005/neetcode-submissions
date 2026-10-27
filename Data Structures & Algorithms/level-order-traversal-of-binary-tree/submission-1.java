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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        level(root,0,res);
        return res;

    }

    public static void level(TreeNode root, int l,List<List<Integer>>list){
        if(root ==null){
            return;
        }
        if(list.size()<=l){
            list.add(new ArrayList<>());
        }
        list.get(l).add(root.val);
        level(root.left,l+1,list);
        level(root.right,l+1,list);
    }
}
