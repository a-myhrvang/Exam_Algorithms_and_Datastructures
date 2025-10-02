package org.example.pg4200.question5;

public class FibonacciRecursive {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Recursive Fibonacci:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
    }
}
