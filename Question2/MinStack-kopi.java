package org.example.pg4200.question2;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        // If minStack is empty or new element is smaller/equal, push it
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            return -1; // stack is empty
        }
        int val = mainStack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
        return val;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1; // stack is empty
        }
        return minStack.peek();
    }
}
