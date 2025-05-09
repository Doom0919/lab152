package main.java.lab15;


import lab15.Expression; 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter an expression : ");
        String expression = new Scanner(System.in).nextLine();
        Expression e = new Expression(expression);
        int result = e.calculate();
        System.out.println("Result: " + result);
    }
}

// git push --set-upstream origin develop
