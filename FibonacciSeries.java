package com.asignmentproblems;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10, firstNumber = 0, secondNumber = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstNumber + ", ");

            // compute the next term
            int nextTerm = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextTerm;
        }
    }
}

