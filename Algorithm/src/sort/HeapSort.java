package sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 1, 7, 3, 10, 2, 9};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        // 1. 形成大根堆
        for (int i = 1; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        // 2. 依次将顶部数挪到尾部，做heapify
        int heapSize = arr.length;
        for (int i = heapSize; i > 0 ; i--) {
            swap(arr, 0, --heapSize);
            heapify(arr, 0, heapSize);
        }
    }

    /**
     * 在最后面新插入一个数，向上形成大根堆过程
     *
     * @param arr   为数组
     * @param index 为新插入数的下标
     */
    public static void heapInsert(int[] arr, int index) {
        int parent = (index - 1) / 2;
        while (arr[index] > arr[parent]) {
            swap(arr, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    /**
     * 从任意位置一个出发，向下形成大根堆过程。
     *
     * @param arr      为数组
     * @param index    为插入位置
     * @param heapSize 数组大小
     */
    public static void heapify(int[] arr, int index, int heapSize) {
        int leftChild = 2 * index + 1;
        while (leftChild < heapSize) { // 如果有左孩子
            int rightChild = 2 * index + 2;
            // 如果有右孩子并且右孩子大，swapIndex为右孩子值，否则为左孩子值
            int swapIndex = (rightChild < heapSize) && (arr[leftChild] <= arr[rightChild]) ? rightChild : leftChild;
            if (arr[index] >= arr[swapIndex]) {
                break;
            }
            swap(arr, index, swapIndex);
            index = swapIndex;
            leftChild = 2 * index + 1;
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
