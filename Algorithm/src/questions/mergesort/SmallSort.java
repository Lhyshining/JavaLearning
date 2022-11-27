package questions.mergesort;

/*
    小数和问题
    在一个数组中，每一个数左边比当前数小的数累加起来，叫做这个数组的小和。
    例子：[1,3,4,2,5]中小数和为：1+1+3+1+1+3+4+2=16
    解：将求左侧的小数和转化为求右侧有几个比当前大的数，在归并排序中两数组合并时计算。
 */
public class SmallSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 2, 5};
        int[] ans = new int[1];
        mergeSort(arr, 0, arr.length - 1, ans);
        System.out.println(ans[0]);
    }

    public static void mergeSort(int[] arr, int left, int right, int[] ans) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSort(arr, left, mid, ans);
        mergeSort(arr, mid + 1, right, ans);
        merge(arr, left, mid, right, ans);
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] ans) {
        int p1 = left;
        int p2 = mid + 1;
        int i = 0;
        int[] array_temp = new int[right - left + 1];
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] < arr[p2]) {
                // 小数和
                ans[0] += (arr[p1] * (right - p2 + 1));
                array_temp[i++] = arr[p1++];
            } else {
                array_temp[i++] = arr[p2++];
            }
        }
        while (p1 <= mid) {
            array_temp[i++] = arr[p1++];
        }
        while (p2 <= right) {
            array_temp[i++] = arr[p2++];
        }
        System.arraycopy(array_temp, 0, arr, left, array_temp.length);
    }
}
