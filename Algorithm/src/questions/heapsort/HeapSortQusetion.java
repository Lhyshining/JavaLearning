package questions.heapsort;

import java.util.PriorityQueue;

public class HeapSortQusetion {
    public static void main(String[] args) {
        /*
        已知一个几乎有序的数组，
        几乎有序是指如果把数组排好顺序的话，每个元素移动的距离可以不超过k，
        并且k相对于数组来说比较小。请选择一个合适的排序算法针对这个数据进行排序
        答：从0开始，构建k窗口，使用小根堆
         */
        // 优先级队列为小根堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(8);
        minHeap.add(7);
        minHeap.add(6);
        minHeap.add(2);
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(9);
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
