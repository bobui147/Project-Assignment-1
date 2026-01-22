public class FibonacciImpl implements Fibonacci {

    @Override
    public int fun(int n, boolean flag) {
        if (!flag) {
            return fibLoop(n);
        }
        return -1;
    }

    private int fibLoop(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
