import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
    String val;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(String val) {
        this.val = val;
    }
}
public class Test {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree("A");	//根节点A
        t.left = new BinaryTree("B");	//A的左子树
        t.right = new BinaryTree("C");	//A的右子树
        t.left.left = new BinaryTree("D");	//B的左子树
        t.left.left.right = new BinaryTree("G");	//D的右子树
        t.right.left = new BinaryTree("E");	//C的左子树
        t.right.right = new BinaryTree("F");
        levelOrder(t);
    }

    public static void levelOrder(BinaryTree t) {
        if(t == null) {
            return;
        }
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(t);
        BinaryTree cur;
        while(!queue.isEmpty()) {
            cur = queue.poll();
            System.out.print(cur.val);
            if(cur.left != null) {
                queue.add(cur.left);
            }
            if(cur.right != null) {
                queue.add(cur.right);
            }
        }
    }
}
