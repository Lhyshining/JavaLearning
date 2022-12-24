package binarytree;

import java.util.Stack;

public class Traversal {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        Traversal traversal = new Traversal();
        System.out.println("递归先序遍历");
        traversal.preorderTraversal(head);
        System.out.println();

        System.out.println("递归中序遍历");
        traversal.inorderTraversal(head);
        System.out.println();

        System.out.println("递归后序遍历");
        traversal.postorderTraversal(head);
        System.out.println();

        System.out.println("非递归先序遍历");
        traversal.preorderTraversalUnrecursion(head);

        System.out.println("非递归中序遍历");
        traversal.inorderTraversalUnrecursion(head);

        System.out.println("非递归后序遍历");
        traversal.postorderTraversalUnrecursion(head);
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

    /**
     * 递归先序遍历
     * @param head 节点
     */
    public void preorderTraversal(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        preorderTraversal(head.left);
        preorderTraversal(head.right);
    }

    /**
     * 递归中序遍历
     * @param head 节点
     */
    public void inorderTraversal(Node head) {
        if (head == null) {
            return;
        }
        inorderTraversal(head.left);
        System.out.print(head.value + " ");
        inorderTraversal(head.right);
    }

    /**
     * 递归后序遍历
     * @param head 节点
     */
    public void postorderTraversal (Node head) {
        if (head == null) {
            return;
        }
        postorderTraversal(head.left);
        postorderTraversal(head.right);
        System.out.print(head.value + " ");
    }

    /**
     * 非递归先序遍历
     * 先压入右节点再压入左节点
     * @param head 节点
     */
    public void preorderTraversalUnrecursion (Node head) {
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                System.out.print(head.value + " ");
                if (head.right != null) {
                    stack.push(head.right);
                }
                if (head.left != null) {
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }

    /**
     * 非递归中序遍历
     * 遇到一个节点就把它压栈，并访问左子树
     * 当左子树访问完毕，弹出并打印
     * 然后遍历节点右子树
     * @param head 节点
     */
    public void inorderTraversalUnrecursion (Node head) {
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.print(head.value + " ");
                    head = head.right;
                }
            }
        }
        System.out.println();
    }

    /**
     * 1. 弹出cur
     * 2. cur放入收集栈
     * 3. 先压左节点再压右节点
     * @param head
     */
    public void postorderTraversalUnrecursion (Node head) {
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            Stack<Node> stackCollection = new Stack<>();
            stack.push(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                stackCollection.push(head);
                if (head.left != null) {
                    stack.push(head.left);
                }
                if (head.right != null) {
                    stack.push(head.right);
                }
            }
            while (!stackCollection.isEmpty()) {
                System.out.print(stackCollection.pop().value + " ");
            }
            System.out.println();
        }
    }
}



