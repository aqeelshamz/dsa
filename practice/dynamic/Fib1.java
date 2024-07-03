package practice.dynamic;

public class Fib1 {
    public static int fib(int n) {
        int first = 0;
        int second = 1;
        if (n == 0) {
            return first;
        }

        if (n == 1) {
            return second;
        }

        for (int i = 2; i <= n; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }

        return second;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fib(40));
        long end = System.currentTimeMillis();

        long time = end - start;

        System.out.println("Time taken: " + time);
    }
}
