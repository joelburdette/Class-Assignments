/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infix2;
import java.lang.*;
import java.util.*;
// CpSc 102 - Class InfixToPostfix: Sample solution for Assignment 4
//
// Objects of this class convert infix expressions to postfix expressions.
// The possible operators are +, -, *, /, and ^.  The operands are floating-
// point constants.  No parentheses are allowed.
//
// This class was adapted from class PostfixInterpreter in the Standish text.
import java.util.*;
import javax.swing.JOptionPane;

public class Infix2 {

// Constructor:   (default)
// Private methods:
    private boolean isOperator(char c) { // Tell whether c is an operator.

        return c == '+' || c == '-' || c == 'x' || c == '/' || c == '^'
                || c == '(' || c == ')';

    }//end isOperator

    private boolean isSpace(char c) {  // Tell whether c is a space.

        return (c == ' ');

    }//end isSpace

    private boolean lowerPrecedence(char op1, char op2) {
        // Tell whether op1 has lower precedence than op2, where op1 is an
        // operator on the left and op2 is an operator on the right.
        // op1 and op2 are assumed to be operator characters (+,-,x,/,^).

        switch (op1) {

            case '+':
            case '-':
                return !(op2 == '+' || op2 == '-');

            case 'x':
            case '/':
                return op2 == '^' || op2 == '(';

            case '^':
                return op2 == '(';

            case '(':
                return true;

            default:  // (shouldn't happen)
                return false;
        }

    } // end lowerPrecedence

// Method to convert infix to postfix:
    public String convertToPostfix(String infix) throws UnsupportedOperationException{
        // Return a postfix representation of the expression in infix.

        Stack operatorStack = new Stack();  // the stack of operators
        Stack operandStack = new Stack<Integer>();
        char c;       // the first character of a token

        StringTokenizer parser = new StringTokenizer(infix, "+-x/^() ", true);
        // StringTokenizer for the input string

        StringBuffer postfix = new StringBuffer(infix.length());  // result

        // Process the tokens.
        while (parser.hasMoreTokens()) {

            String token = parser.nextToken();          // get the next token
            // and let c be
            c = token.charAt(0);         // the first character of this token

            if ((token.length() == 1) && isOperator(c)) {    // if token is
                //  an operator

                while (!operatorStack.empty()
                        && !lowerPrecedence(((String) operatorStack.peek()).charAt(0), c)) // (Operator on the stack does not have lower precedence, so
                //  it goes before this one.)
                {
                    postfix.append(" ").append((String) operatorStack.pop());
                }

                if (c == ')') {
                    // Output the remaining operators in the parenthesized part.
                    String operator = (String) operatorStack.pop();
                    while (operator.charAt(0) != '(') {
                        postfix.append(" ").append(operator);
                        operator = (String) operatorStack.pop();
                    }
                } else {
                    operatorStack.push(token);// Push this operator onto the stack.
                }
            } else if ((token.length() == 1) && isSpace(c)) { // else if
                // token was a space                                                  // ignore it
            } else if(Character.isDigit(c)) {  // (if it is an operand)
                postfix.append(" ").append(token);  // output the operand
            } else {
                throw new UnsupportedOperationException("" + c);
            }

        }// end while for tokens

        // Output the remaining operators on the stack.
        String operStk = operatorStack.toString();
        try{
        while (!operatorStack.empty()) {
            postfix.append(" ").append((String) operatorStack.pop());
        } 
        }catch (EmptyStackException ex){
        
            throw new UnsupportedOperationException(operStk);
        }

        // Return the result.
        return postfix.toString();

    }//end convertToPostfix

    public static void main(String[] args) {  // Test method for the class.
        Infix2 converter = new Infix2();
        String infix = JOptionPane.showInputDialog("Enter an infix expression");
        System.out.println("infix: " + infix);
        System.out.println("postfix: " + converter.convertToPostfix(infix));
    }

}
