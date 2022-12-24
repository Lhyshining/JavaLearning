package binarytree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SequenceTraversal {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        System.out.println("层序遍历");
        SequenceTraversal traversal = new SequenceTraversal();
        traversal.sequenceTraversal(head);
    }

    public void sequenceTraversal(Node head) {
        if (head == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);

        Map<Node, Integer> levelMap = new HashMap<>();
        levelMap.put(head, 1);
        int curLevel = 1;
        int curLevelNodes = 0;
        int max = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            head = queue.poll();
            int curNodeLevel = levelMap.get(head);
            if (curNodeLevel == curLevel) {
                curLevelNodes++;
            } else {
                // 没有统计最后一层
                max = Math.max(curLevelNodes, max);
                curLevel++;
                curLevelNodes = 1;
            }

            System.out.print(head.value + " ");
            if (head.left != null) {
                levelMap.put(head.left, curNodeLevel + 1);
                queue.add(head.left);
            }
            if (head.right != null) {
                levelMap.put(head.right, curNodeLevel + 1);
                queue.add(head.right);
            }
        }
        System.out.println();
        max = Math.max(curLevelNodes, max);
        System.out.println("max nodes:" + max);
    }
}
