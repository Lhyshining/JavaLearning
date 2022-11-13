package bigdecimal;

import java.math.BigInteger;

public class BigIntegerMethod {
    public static void main(String[] args) {
//        long l = 2333333333333333333333l;

        BigInteger bigInteger = new BigInteger("2333333333333333333333");
        System.out.println(bigInteger);
        // 不能使用 + - * /
        BigInteger bigInteger1 = new BigInteger("111");
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.subtract(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));
        System.out.println(bigInteger.divide(bigInteger1));
    }
}
