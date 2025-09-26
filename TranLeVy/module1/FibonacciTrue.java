public class Fibonacci {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        boolean flag = true; 
        int n = 10;

        if (flag) {
            System.out.println("Fibonacci Recursive:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciRecursive(i) + " ");
            }
        }
    }
}
