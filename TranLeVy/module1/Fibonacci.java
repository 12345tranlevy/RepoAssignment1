package TranLeVy.module1;

public interface Fibonacci {
    /**
     * Tính số Fibonacci thứ n.
     * @param n chỉ số của số Fibonacci
     * @param flag nếu true thì dùng đệ quy, nếu false thì dùng vòng lặp
     * @return giá trị số Fibonacci thứ n
     */
    int fun(int n, boolean flag);
}
