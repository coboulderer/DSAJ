package com.rk.dsaj.four;

import java.util.Stack;

public class PostFixCalculator {



    /**
     * Will perform postfix calculations on input.
     * If input is null or empty will return 0
     * @param input A string representing the postfix operations to calculate
     * @return the answer to the calculation
     */
    public long postFixCalculate(String input) {
        long numOne, numTwo, answer = 0;
        Stack<Long> numberStack = new Stack<>();
        if (input != null && input.length() > 0) {
            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                if (current >= '0' && current <= '9') {
                    long num = Long.parseLong(String.valueOf(current));
                    numberStack.push(num);
                } else {
                    numOne = numberStack.pop();
                    numTwo = numberStack.pop();
                    switch (current) {
                        case '+':
                            numberStack.push(numOne + numTwo);
                            break;
                        case '-':
                            numberStack.push(numTwo - numOne);
                            break;
                        case '*':
                            numberStack.push(numOne * numTwo);
                            break;
                        case '/':
                            numberStack.push(numTwo / numOne);
                            break;
                        default:
                            numberStack.push(0L);
                    }
                }
            }
            answer = numberStack.pop();
        }
        return answer;
    }
}
