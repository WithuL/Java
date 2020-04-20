
class Node {
    String val;
    Node left;
    Node right;

    public Node(String val) {
        this.val = val;
    }
}

public class BinaryTree {
    Node root;

    // 前序遍历
    void preOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val+ " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    };
    // 中序遍历
    void inOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    };
    // 后序遍历
    void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    };
    // 遍历思路-求结点个数

    static int size = 0;

    void getSize1(Node root) {
        if(root == null) {
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    };

    // 子问题思路-求结点个数
    int getSize2(Node root) {
        if(root == null) {
            return 0;
        }
        return 1 + getSize2(root.left) + getSize2(root.right);
    };

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1(Node root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
            return;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    };
    // 子问题思路-求叶子结点个数
    int getLeafSize2(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.left);
    };
    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(Node root,int k ) {
        if(root == null || k < 1) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    };
    // 查找 val 所在结点，没有找到返回 null
// 按照 根 -> 左子树 -> 右子树的顺序进行查找
// 一旦找到，立即返回，不需要继续在其他位置查找
    Node find(Node root, String val) {
        if(root == null) {
            return null;
        }
        if(root.val.equals(val)) {
            return root;
        }
        if(find(root.left,val) != null)  {
            return find(root.left,val);
        }
        return find(root.right,val);
    };

    public static void main(String[] args) {
        //建造二叉树
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node("A");
        binaryTree.root.left = new Node("B");
        binaryTree.root.right = new Node("C");
        binaryTree.root.left.left = new Node("D");
        binaryTree.root.left.right = new Node("E");
        binaryTree.root.right.right = new Node("F");

        //binaryTree.getSize1(binaryTree.root);
        //System.out.println(BinaryTree.size);

        //System.out.println(binaryTree.getSize2(binaryTree.root));

        //binaryTree.getLeafSize1(binaryTree.root);
        //System.out.println(BinaryTree.leafSize);

        //System.out.println(binaryTree.getLeafSize2(binaryTree.root));

        //System.out.println(binaryTree.getKLevelSize(binaryTree.root, 2));

        System.out.println(binaryTree.find(binaryTree.root, "G").val);
    }
}
