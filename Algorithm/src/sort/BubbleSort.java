package sort;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 1, 7, 3, 10, 2};
        new BubbleSort().bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
        0 * * * * *
        1 * * * * @
        2 * * * @ @
        3 * * @ @ @
        4 * @ @ @ @
     */
    public void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // the first method
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // the second method
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // swap
    // 只能在i != j 中使用
    // a = a ^ b;
    // b = a ^ b = a ^ b ^ b = a;
    // a = a ^ b = a ^ b ^ a = b;
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
