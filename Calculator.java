public class Calculator {

    public enum SIGN {
        PLUS, MINUS, MULTIPLY, DIVIDE
    }

    private Double calculate(SIGN sign, Double arg1, Double arg2) {
        switch (sign) {
            case MINUS:
                return arg1 - arg2; // branch implement_minus
            default:
                return 0d;
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Minus: " + c.calculate(SIGN.MINUS, 5.0, 3.0));
    }
}
