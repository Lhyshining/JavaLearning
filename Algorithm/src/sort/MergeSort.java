package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 1, 7, 3, 10, 2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (right <= left) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // merge
        int p1 = left;
        int p2 = mid + 1;
        int[] arr_temp = new int[right - left + 1];
        int i = 0;
        while (p1 <= mid && p2 <= right) {
            arr_temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            arr_temp[i++] = arr[p1++];
        }
        while (p2 <= right) {
            arr_temp[i++] = arr[p2++];
        }
        // 替换
        System.arraycopy(arr_temp, 0, arr, left, arr_temp.length);
    }
}
