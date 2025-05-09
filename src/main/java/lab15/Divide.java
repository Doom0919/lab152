package lab15;

public class Divide {
    Divide() {
        System.out.println("Division class constructor");
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
