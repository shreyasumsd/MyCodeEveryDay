package StackPQs;

import java.util.Stack;

public class Q1PushPullNumbers 
{
    // Method to push numbers from 1 to 10
    public static void pushNumbers(Stack<Integer> stack) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(stack.push(i));
        }

    }

    // Method to pop all numbers
    public static void popNumbers(Stack<Integer> stack) {

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("Pushing numbers:");
        pushNumbers(stack);
        System.out.println();

        System.out.println("Popping numbers:");
        popNumbers(stack);

    }
}
