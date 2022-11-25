package questions.xor;

public class EvenTimesOddTimes01 {
    public static void main(String[] args) {
        // 题目1：在一个数组中，存在一个出现次数为奇数的数，其余数出现次数为偶数，找出这个数。
        // 解：将数组中所有数异或在一起，根据“不进位相加”，最终留下“1”的为奇数次出现的。
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5};
        int ans = 0;
        for (int j : arr) {
            ans = ans ^ j;
        }
        System.out.println(ans);
    }
}
