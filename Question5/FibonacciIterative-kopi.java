package org.example.pg4200.question5;

public class FibonacciIterative {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println("Iterative Fibonacci:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
    }
}
