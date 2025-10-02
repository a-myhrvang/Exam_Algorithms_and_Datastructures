package org.example.pg4200.question2;

public class StackTest {
    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(5);   // main: [5], min: [5]
        stack.push(3);   // main: [5, 3], min: [5, 3]
        stack.push(7);   // main: [5, 3, 7], min: [5, 7]

        System.out.println(stack.getMin()); // Output: 3

        stack.pop();    // removes 7 -> main: [5, 3], min [5, 3]
        stack.pop();    // removes 3 -> main: [5], min [5]

        System.out.println(stack.getMin()); // Output: 5
    }
}
