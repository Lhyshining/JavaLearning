package binarytree;

public class Traverse {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        Traverse traverse = new Traverse();
        System.out.println("先序遍历");
        traverse.preorderTraverse(head);
        System.out.println();
        System.out.println("中序遍历");
        traverse.inorderTraverse(head);
        System.out.println();
        System.out.println("后序遍历");
        traverse.postorderTraverse(head);
    }

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    /**
     * 对于一棵二叉树
     *       1
     *   2        3
     * 4  5     6  7
     *
     * 递归序 1, 2, 4, 4, 4, 2, 5, 5, 5, 2, 1,
     * 3, 6, 6, 6, 3, 7, 7, 7, 3, 1
     * 先序遍历（头左右，第一次打印递归序中的数字）：1,2,4,5,3,6,7
     * 中序遍历（左头右，第二次打印递归序中的数字）：4,2,5,1,6,3,7
     * 后序遍历（左右头，第三次打印递归序中的数字）：4,5,2,6,7,3,1
     */


    public void preorderTraverse(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        preorderTraverse(head.left);
        preorderTraverse(head.right);
    }

    public void inorderTraverse(Node head) {
        if (head == null) {
            return;
        }
        inorderTraverse(head.left);
        System.out.print(head.value + " ");
        inorderTraverse(head.right);
    }

    public void postorderTraverse (Node head) {
        if (head == null) {
            return;
        }
        postorderTraverse(head.left);
        postorderTraverse(head.right);
        System.out.print(head.value + " ");
    }
}
