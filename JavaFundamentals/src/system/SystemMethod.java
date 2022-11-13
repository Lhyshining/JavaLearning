package system;

import java.util.Arrays;

public class SystemMethod {
    public static void main(String[] args) {
        // arraycopy
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[3];
        // src,srcPos,dest,destPos,length
        System.arraycopy(arr1,0,arr2,0,3);
        System.out.println(Arrays.toString(arr2));

        // currentTimeMillens
        System.out.println(System.currentTimeMillis());

        System.out.println("ok1");
        // 0为正常状态
        System.exit(0);
        System.out.println("ok2");



    }
}
