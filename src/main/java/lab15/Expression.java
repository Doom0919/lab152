package lab15;

import java.util.ArrayList;
import java.util.List;

public class Expression {

    private String expr;

    public Expression(String expr) {
        this.expr = expr;
    }

    public List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        String[] numParts = expr.split("[+\\-*/]");
        for (String part : numParts) {
            if (!part.trim().isEmpty()) {
                numbers.add(Integer.parseInt(part.trim()));
            }
        }
        return numbers;
    }

    public List<Character> getOperators() {
        List<Character> operators = new ArrayList<>();
        for (char c : expr.toCharArray()) {
            if (c == '+' || c == '-') {
                operators.add(c);
            }
        }
        return operators;
    }

    public int calculate() {
        List<Integer> numbers = getNumbers();
        List<Character> operators = getOperators();

        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            int next = numbers.get(i + 1);
            if (op == '+') {
                result += next;
            } else {
                result -= next;
            }
        }

        return result;
    }
}
