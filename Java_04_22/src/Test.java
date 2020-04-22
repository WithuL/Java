public class Test {

    public static void main(String[] args) {

    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        int max1 = max(root.left);
        int max2 = max(root.right);
        return isBalanced(root.left) && isBalanced (root.right) &&
                max1 - max2 >= -1 && max1 -max2 <= 1;
    }
    public int max(TreeNode root ) {
        if(root == null) {
            return 0;
        }
        int max1 = max(root.left);
        int max2 = max(root.right);
        return 1 + java.lang.Math.max(max1,max2);
    }

}