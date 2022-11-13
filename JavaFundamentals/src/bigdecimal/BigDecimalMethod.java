package bigdecimal;

import java.math.BigDecimal;

public class BigDecimalMethod {
    public static void main(String[] args) {
        double d = 1999.111111111111111111111111111111111d;
        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("1999.11111111111111111111111111111");
        System.out.println(bigDecimal);
        BigDecimal bigDecimal1 = new BigDecimal("2222.22222222222222222222222");

        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        // 除法可能会抛出异常，无限循环异常
//        System.out.println(bigDecimal.divide(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING));
    }
}
