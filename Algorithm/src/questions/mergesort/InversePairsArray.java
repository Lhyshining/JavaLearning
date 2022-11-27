package questions.mergesort;

import java.util.Arrays;
import java.util.LinkedList;

/*
    逆序对
    在一个数组中，左边的数如果比右边的数大，则这两个数构成一个逆序对，请打印所有的逆序。
    例子：[3,2,4,5,0]中逆序对为{3，2}，{3，0}，{2，0}，{4，0}，{5，0}
    解：在归并中，如果左侧的数大于右侧的数，则在放入右侧数之前从左到中间打印所有的逆序对。注意此时如果左右侧数相等，先放入左侧的数
 */
public class InversePairsArray {
    public static void main(String[] args) {
        int[] arr = {3, 2,2, 4, 5, 0};
        LinkedList<int[]> ans = new LinkedList<>();
        mergeSort(arr, 0, arr.length - 1, ans);
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }
    }

    public static void mergeSort(int[] arr, int left, int right, LinkedList<int[]> ans) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSort(arr, left, mid, ans);
        mergeSort(arr, mid + 1, right, ans);
        merge(arr, left, mid, right, ans);
    }

    public static void merge(int[] arr, int left, int mid, int right, LinkedList<int[]> ans) {
        int p1 = left;
        int p2 = mid + 1;
        int[] arr_temp = new int[right - left + 1];
        int i = 0;
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] <= arr[p2]) {

                arr_temp[i++] = arr[p1++];
            } else {
                // 添加逆序对
                for (int j = p1; j <= mid; j++) {
                    int[] ints = {arr[j], arr[p2]};
                    ans.add(ints);
                }

                arr_temp[i++] = arr[p2++];
            }
        }
        while (p1 <= mid) {
            arr_temp[i++] = arr[p1++];
        }
        while (p2 <= right) {
            arr_temp[i++] = arr[p2++];
        }
        System.arraycopy(arr_temp, 0, arr, left, arr_temp.length);
    }
}
