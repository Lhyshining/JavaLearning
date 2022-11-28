package sort;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 1, 7, 3, 10, 2, 9}; // 1 2 2 2 3 3 7 9 9 10
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (right <= left) {
            return;
        }
        // begin end为边界，数组取不到
        int begin = left - 1;
        int end = right + 1;
        int len = right - left + 1;
        int compare = arr[(int) (Math.random() * len) + left];
        int i = left;
        while (i < end) {
            if (arr[i] < compare) { // 放到左边，i++, begin++
                swap(arr, i++, ++begin);
            } else if (arr[i] == compare) { // 放在中间, i++
                i++;
            } else { // 放到右边, end--
                swap(arr, --end, i);
            }
        }
        // 递归
        quickSort(arr, left, begin);
        quickSort(arr, end, right);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
