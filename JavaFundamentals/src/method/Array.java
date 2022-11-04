package method;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i;
        }
        // 引用传递
        int[] arr2 = arr; // 引用传递，arr2和arr共享一个地址，修改arr2,arr也会随之修改
        // 拷贝构造



        printArray(arr);
        int[] reverseArr = reverseArray(arr);
        printArray(reverseArr);
        // 二维数组
        int[][] twoDimensionalArray = new int[2][5];
        int[][] twoDimensionalArray2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        printArray(twoDimensionalArray2[0]);
        System.out.println(twoDimensionalArray2[0][0]);
        // 打印2维数组
        System.out.println("遍历2维数组：");
        for (int[] ints : twoDimensionalArray2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(" ");
        }
        /*
            Arrays类尝试
         */
        int[] a = {1, 2, 6, 3, 7, 9, 333, 111};
        System.out.println("====================");
        System.out.println("Arrays类测试");
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] arr) {
        // 增强型for-each循环，arr.for
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }

    // 反转数组
    public static int[] reverseArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - i - 1];
        }
        return arr2;
    }
}
