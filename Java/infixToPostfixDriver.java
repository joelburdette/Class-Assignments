/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixtopostfixdriver;

import java.lang.*;
import java.util.*;
import javax.swing.JOptionPane;

class StackDblList {

    private Node head;
    private Node tail;
    private Node prev;

    public boolean empty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public char push(char item) {
        Node newNode;
        newNode = new Node(item);
        newNode.next = head;
        head = newNode;
        return newNode.item;
    }

    public char peek() {
        if (empty()) {
            return ' ';
        }
        return head.item;
    }

    public char pop() {
        Node tmp;
        if (head == null) {
            return ' ';
        }
        tmp = head;
        head = head.next;
        return tmp.item;
    }

    public class Node {

        Node next;
        Node prev;
        char item;

        Node(char item) {
            next = null;
            prev = null;
            this.item = item;
        }

        public String toString() {
            String str = " ";
            char c;
            while (!empty()) {
                c = pop();
                str = str + Character.toString(c);
            }

            return str;
        }
    }

}

class PFEvaluator {

    private static final String OPERATORS = "+-*/x";
    private Stack<Integer> operandStack;

    public int evalOp(char op) {
        int lhs = operandStack.pop();
        int rhs = operandStack.pop();
        int result = 0;
        switch (op) {
            case '+':
                result = rhs + lhs;
                break;
            case '-':
                result = rhs - lhs;
                break;
            case '/':
                result = rhs / lhs;
                break;
            case '*':
                result = rhs * lhs;
                break;
            case 'x':
                result = rhs * lhs;
                break;
        }
        return result;
    }

    private boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch) != -1;
    }

    public int eval(String expression) throws Exception {
        operandStack = new Stack<Integer>();
        String[] tokens = expression.split("\\s+");
        try {
            for (String nextToken : tokens) {
                char firstChar = nextToken.charAt(0);
                if (Character.isDigit(firstChar)) {
                    int value = Integer.parseInt(nextToken);
                    operandStack.push(value);
                } else if (isOperator(firstChar)) {
                    int result = evalOp(firstChar);
                    operandStack.push(result);
                } else {
                    throw new UnsupportedOperationException(" " + firstChar);
                }
            }
            int answer = operandStack.pop();
            if (operandStack.empty()) {
                System.out.println(answer);
                return answer;
            } else {
                //System.out.println("Stack should be empty");
                //return 0;
                throw new EmptyStackException();
            }
        } catch (IllegalStateException ex) {
            throw new IllegalStateException();
        }
    }
}

class SyntaxErrorException extends Exception {

    SyntaxErrorException(String message) {
        super(message);
    }
}

class Infix {

    private Stack<Character> operatorStack;
    private static final String OPERATORS = "+-/x^";
    private static final int[] PRECEDENCE = {1, 1, 2, 2, 3};
    private StringBuilder postfix;

    public String convert(String infix) throws Exception {
        operatorStack = new Stack<Character>();
        postfix = new StringBuilder();
        String[] tokens = infix.split("\\s+");

        try {
            for (String nextToken : tokens) {
                char firstChar = nextToken.charAt(0);
                if (Character.isJavaIdentifierStart(firstChar) || Character.isDigit(firstChar)) {
                    postfix.append(nextToken);
                    postfix.append(' ');
                    //}else if(){
                } else if (isOperator(firstChar)) {
                    processOperator(firstChar);
                } else {
                    throw new UnsupportedOperationException(": " + firstChar);
                }
            }
            while (!operatorStack.empty()) {
                char op = operatorStack.pop();
                postfix.append(op);
                postfix.append(' ');
            }
            return postfix.toString();             //System.out.println("Stack should be empty");
        } catch (EmptyStackException ex) {
            throw new SyntaxErrorException("IllegalStateException");
        }
    }

    private void processOperator(char op) {
        if (operatorStack.empty()) {
            operatorStack.push(op);
        } else {
            char topOp = operatorStack.peek();
            if (precedence(op) > precedence(topOp)) {
                operatorStack.push(op);
            } else {
                while (!operatorStack.empty() && precedence(op) <= precedence(topOp)) {
                    operatorStack.pop();
                    postfix.append(topOp);
                    postfix.append(' ');
                    if (!operatorStack.empty()) {
                        topOp = operatorStack.peek();
                    }
                }
                operatorStack.push(op);
            }
        }
    }

    private boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch) != -1;
    }

    private int precedence(char op) {
        return PRECEDENCE[OPERATORS.indexOf(op)];
    }
}

public class InfixtoPostfixDriver {

    public static void main(String[] args) throws Exception {
        Infix intoPost = new Infix();
        String infix = JOptionPane.showInputDialog("Enter an infix expression");
        try {
            String postfix = intoPost.convert(infix);
            System.out.println("infix expression " + infix + " converts to " + postfix);
        } catch (SyntaxErrorException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
