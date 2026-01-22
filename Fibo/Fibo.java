public class FibonacciImpl implements Fibonacci {

    @Override
    public int fun(int n, boolean flag) {
        if (flag) {
            return fibRecursive(n);
        }
        return -1;
    }

    private int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
}
