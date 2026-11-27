package StackPQs;

import java.util.Stack;

public class Q2PrintStack 
{
    public static void printStackBottomToTop(Stack<?> stack)
    {
        for (int i = 0; i < stack.size(); i++)
        {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) 
    {
        Q2PrintStack stack = new Q2PrintStack(); 
        System.out.println(stack);
    }    
}
