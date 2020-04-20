import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class Test {

}

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int right = 0;
        for(int x : pushed) {
            stack.push(x);
            while(!stack.empty() && stack.peek() == popped[right]) {
                stack.pop();
                right++;
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

class Solution1 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        pre(root);
        return list;
    }
    public void pre(TreeNode root) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        pre(root.left);
        pre(root.right);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution2{
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        in(root);
        return list;
    }
    public void in(TreeNode root) {
        if(root == null) {
            return;
        }
        in(root.left);
        list.add(root.val);
        in(root.right);
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution3 {
    List<Integer> list = new ArrayList<>();
    public void post(TreeNode root) {
        if(root == null) {
            return;
        }
        post(root.left);
        post(root.right);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        post(root);
        return list;
    }
}

