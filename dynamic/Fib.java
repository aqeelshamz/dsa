package dynamic;

import java.math.BigInteger;
import java.util.HashMap;

public class Fib {
    public static BigInteger fib(int n, HashMap<Integer, BigInteger> memo) {
        if (n == 0) {
            return BigInteger.ZERO;
        }

        if (n == 1) {
            return BigInteger.ONE;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        BigInteger ans = fib(n - 1, memo).add(fib(n - 2, memo));
        memo.put(n, ans);
        return ans;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fib(12000, new HashMap<>()));
        long end = System.currentTimeMillis();

        long time = end - start;

        System.out.println("Time taken: " + time);
    }
}
