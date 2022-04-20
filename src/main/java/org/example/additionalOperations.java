package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class additionalOperations {
    public static int numberCount(String expr){
        int count = 0;
        char[] symb = expr.toCharArray();
        for (int i=0;i<symb.length;i++){
            if (symb[i] >= '0' && symb[i]<='9'){
                count++;
            }
        }
        return count;
    }
    public static boolean areBracketsBalanced(String expr)
    {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(')
            {
                stack.push(x);
                continue;
            }

            if (x==')')
                stack.pop();
        }
        return (stack.isEmpty());
    }
}
