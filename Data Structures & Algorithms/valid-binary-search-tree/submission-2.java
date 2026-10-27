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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        Boolean isSorted = IntStream.range(0,list.size()-1).allMatch(i -> list.get(i)<list.get(i+1));
        return isSorted;
    }

    public static List<Integer> inorder(TreeNode root,List<Integer>list){
        
        if(root ==null){
            return list;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        return list;
    }
}
