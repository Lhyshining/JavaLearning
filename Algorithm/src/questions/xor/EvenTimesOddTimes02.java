package questions.xor;

public class EvenTimesOddTimes02 {
    public static void main(String[] args) {
        // 题目2：在一个数组中，存在两个出现次数为奇数的数，其余数出现次数为偶数，找出这个数。

        int[] arr = {1, 2, 2, 3, 3, 3, 3, 4, 4, 5};
        int ans = 0;
        for (int j : arr) {
            ans ^= j;
        }
        // ans 为 1 ^ 5的结果
        int rightOne = ans & (~ans + 1); // 一个不为0的数最右侧的1提取出来
        int onlyOne = 0;
        for (int i : arr) {
            if ((i & rightOne) == 0) {
                onlyOne ^= i;
            }
        }
        System.out.println(onlyOne + " " + (onlyOne ^ ans));
    }
}
