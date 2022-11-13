package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysMethod {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 4};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (int)o1;
                int i2 = (int)o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // binarySearch 要求该数组是有序的，且为升序
        int idx = Arrays.binarySearch(arr, 4);
        System.out.println(idx);

        // copyOf
        Integer[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));

        // fill 使用o替换原来元素
        Integer[] num = new Integer[]{9,3,2};
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        // equals
        boolean equals = Arrays.equals(arr,newArr);
        System.out.println(equals);

        // asList 将一组值转换为list
        List asList = Arrays.asList(2,3,4,5,6);
        System.out.println(asList);
    }
}
