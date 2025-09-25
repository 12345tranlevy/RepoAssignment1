package TranLeVy.module1;

public class FibonacciImpl implements Fibonacci {

    @Override
    public int fun(int n, boolean flag) {
        if (flag) {
            // Recursive
            if (n <= 1) return n;
            return fun(n - 1, true) + fun(n - 2, true);
        } else {
            // Iterative
            if (n <= 1) return n;
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
}
