package lab15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression;

        do {
            System.out.println("Type 'exit' to quit the program.");
            System.out.print("Enter an expression: ");
            expression = scanner.nextLine();

            if (!expression.equals("exit")) {
                Expression e = new Expression(expression);
                int result = e.calculate();
                System.out.println("Result: " + result);
            }
        } while (!expression.equals("exit"));
        
        scanner.close(); 
    }
}

// git push --set-upstream origin develop
