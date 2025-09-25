public class Calculator {

    public enum SIGN {
        PLUS, MINUS, MULTIPLY, DIVIDE
    }

    private Double calculate(SIGN sign, Double arg1, Double arg2) {
        switch (sign) {
            case MULTIPLY:
                return arg1 * arg2; // branch implement_multiply
            default:
                return 0d;
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Multiply: " + c.calculate(SIGN.MULTIPLY, 5.0, 3.0));
    }
}
