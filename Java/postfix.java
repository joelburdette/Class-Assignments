/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfix;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author rtibbetts268
 */
public class PostFix {

    /**
     * Operators in reverse order of precedence.
     */
    private static final String operators = "-+/*_";
    private static final String operands = "0123456789x";

    /*public int evalInfix(String infix)
     {
     return evaluatePostfix(convert2Postfix(infix));
     }*/
    public String xToValue(String postfixExpr, String x) {
        char[] chars = postfixExpr.toCharArray();
        StringBuilder newPostfixExpr = new StringBuilder();

        for (char c : chars) {
            if (c == 'x') {
                newPostfixExpr.append(x);
            } else {
                newPostfixExpr.append(c);
            }
        }
        return newPostfixExpr.toString();
    }

    public String convert2Postfix(String infixExpr) {
        char[] chars = infixExpr.toCharArray();
        StringBuilder in = new StringBuilder(infixExpr.length());

        for (int i = 0; i < chars.length; i++) {
            if (infixExpr.charAt(i) == '-') {
                if (i == 0) {
                    in.append('_');
                } else if (isOperand(infixExpr.charAt(i + 1))) {
                    if (i != infixExpr.length()) {
                        if (isOperator(infixExpr.charAt(i - 1))) {
                            in.append('_');
                        }
                    } else {
                        in.append(infixExpr.charAt(i));
                    }
                } else {
                    in.append(infixExpr.charAt(i));
                }
            } else {
                in.append(infixExpr.charAt(i));
            }
        }

        chars = in.toString().toCharArray();
        Stack<Character> stack = new Stack<Character>();
        StringBuilder out = new StringBuilder(in.toString().length());

        for (char c : chars) {
            if (isOperator(c)) {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    if (operatorGreaterOrEqual(stack.peek(), c)) {
                        out.append(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    out.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (isOperand(c)) {
                out.append(c);
            }
        }
        while (!stack.empty()) {
            out.append(stack.pop());
        }
        return out.toString();
    }

    public int evaluatePostfix(String postfixExpr) {
        char[] chars = postfixExpr.toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        for (char c : chars) {
            if (isOperand(c)) {
                stack.push(c - '0'); // convert char to int val
            } else if (isOperator(c)) {
                int op1 = stack.pop();
                int op2;
                int result;
                switch (c) {
                    case '_':
                        result = op1 * -1;
                        stack.push(result);
                        break;
                    case '*':
                        op2 = stack.pop();
                        result = op1 * op2;
                        stack.push(result);
                        break;
                    case '/':
                        op2 = stack.pop();
                        result = op2 / op1;
                        stack.push(result);
                        break;
                    case '+':
                        op2 = stack.pop();
                        result = op1 + op2;
                        stack.push(result);
                        break;
                    case '-':
                        op2 = stack.pop();
                        result = op2 - op1;
                        stack.push(result);
                        break;
                }
            }
        }
        return stack.pop();
    }

    private int getPrecedence(char operator) {
        int ret = 0;
        if (operator == '-' || operator == '+') {
            ret = 1;
        } else if (operator == '*' || operator == '/') {
            ret = 2;
        }
        if (operator == '_') {
            ret = 3;
        }
        return ret;
    }

    private boolean operatorGreaterOrEqual(char op1, char op2) {
        return getPrecedence(op1) >= getPrecedence(op2);
    }

    private boolean isOperator(char val) {
        return operators.indexOf(val) >= 0;
    }

    private boolean isOperand(char val) {
        return operands.indexOf(val) >= 0;
    }

    public static void main(String[] args) throws Exception {
        PostFix p = new PostFix();
        //String str = ("3 4 7 x 2 / +");
        String str = JOptionPane.showInputDialog("Enter a postfix expression");
        //try{
        p.evaluatePostfix(str);
}
}
