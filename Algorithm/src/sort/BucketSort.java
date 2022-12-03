package sort;

import java.util.Arrays;

public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {99, 2, 31, 21, 11, 17, 3, 10, 2, 9};
        int digits = maxbits(arr);
        bucketSort(arr, digits);
        System.out.println(Arrays.toString(arr));
    }

    public static void bucketSort(int[] arr, int digits) {
        final int radix = 10;
        int i = 0;
        int j = 0;
        // 有多少个数准备多少个辅助空间
        int[] bucket = new int[arr.length];
        for (int d = 1; d <= digits; d++) { // 有多少位就进出几次
            // 10个空间,前缀和，用于确定位置
            // count[0] 当前位是0的数字有多少个
            // count[1] 当前位是0和1的数字有多少个
            // count[2] 当前位是012的数字有多少个
            int[] count = new int[radix];
            for (i = 0; i < arr.length; i++) {
                j = getDigit(arr[i], d); // 第d位数字
                count[j]++; // 词频统计
            }
            for (i = 1; i < radix; i++) {
                count[i] = count[i] + count[i - 1]; // 累加和
            }
            // 从右开始，根据词频找位置
            for (i = arr.length - 1; i >= 0; i--) {
                j = getDigit(arr[i], d);
                bucket[count[j] - 1] = arr[i];
                count[j]--;
            }
            // 调整位置
            for (i = 0, j = 0; i < arr.length; i++, j++) {
                arr[i] = bucket[j];
            }
        }

    }

    /**
     * 判断有几位
     *
     * @param arr 数组
     * @return 最大值的位数
     */
    public static int maxbits(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        int res = 0;
        while (max != 0) {
            res++;
            max /= 10;
        }
        return res;
    }

    /**
     * 取出i的第j位数字
     *
     * @param i 数
     * @param j 第几位数
     * @return 取出的i的第j位数字
     */
    public static int getDigit(int i, int j) {
        int ans = -1;
        for (int k = 1; k <= j; k++) {
            if (k == j) {
                ans = i % 10;
            } else {
                i /= 10;
            }
        }
        return ans;
    }
}
