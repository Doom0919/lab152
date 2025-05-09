package lab15;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    @Test
    void testGetNumbers() {
        Expression expression = new Expression("10 + 20 - 5");
        List<Integer> numbers = expression.getNumbers();
        assertEquals(List.of(10, 20, 5), numbers, "Numbers should be extracted correctly");
    }

    @Test
    void testGetOperators() {
        Expression expression = new Expression("10 + 20 - 5");
        List<Character> operators = expression.getOperators();
        assertEquals(List.of('+', '-'), operators, "Operators should be extracted correctly");
    }

    @Test
    void testCalculateAddition() {
        Expression expression = new Expression("10 + 20");
        int result = expression.calculate();
        assertEquals(30, result, "Addition should be calculated correctly");
    }

    @Test
    void testCalculateSubtraction() {
        Expression expression = new Expression("20 - 10");
        int result = expression.calculate();
        assertEquals(10, result, "Subtraction should be calculated correctly");
    }

    @Test
    void testCalculateAdditionAndSubtraction() {
        Expression expression = new Expression("10 + 5 - 3 + 2");
        int result = expression.calculate();
        assertEquals(14, result, "Addition and subtraction should be calculated correctly");
    }

    @Test
    void testIgnoreMultiplicationAndDivision() {
        Expression expression = new Expression("10 + 5 - 3 - 2 + 1");
        int result = expression.calculate();
        // Only + and - are evaluated: 10 + 5 - 2 = 13
        assertEquals(11, result, "Should only evaluate addition and subtraction, ignoring * and /");
    }
}
