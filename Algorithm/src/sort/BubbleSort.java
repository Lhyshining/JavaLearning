package sort;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 1, 7, 3, 10, 2};
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 全程无交换标识符
            int flag = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
