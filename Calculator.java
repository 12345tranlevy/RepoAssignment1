public class Calculator {

    public enum SIGN {
        PLUS, MINUS, MULTIPLY, DIVIDE
    }

    private Double calculate(SIGN sign, Double arg1, Double arg2) {
        switch (sign) {
            case DIVIDE:
                if (arg2 == 0) throw new ArithmeticException("Divide by zero");
                return arg1 / arg2; // branch implement_divide
            default:
                return 0d;
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Divide: " + c.calculate(SIGN.DIVIDE, 6.0, 3.0));
    }
}
