package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.impl.LinkedStack;

//Dan Walker
//CS3308
//MISSION: 02
//Objective: Gain experience with stacks/doubly linked lists/Postfix expressions

public class PostFix {

    /**
     * Evaluates the provided postfix expression and returns the answer. If the
     * provided string is null, empty, or only contains whitespace then return
     * 0;
     *
     * @param 'postfix' A string representing an postfix notation expression where
     *                each item is separated by a space.
     * @return value of the postfix express or 0 if the postfix expression is null,
     * empty, or contains only whitespace.
     */
    public static int evalPostFix(String infix) {
        boolean isEmpty = infix == null || infix.trim().isEmpty()|| infix.isEmpty();
        if  (isEmpty) { return 0;}
        else {
            String[] strIn = infix.split(" ");
            LinkedStack<Integer> stack = new LinkedStack<>();

            for (int i = 0; i < strIn.length; i++) {
                String s = strIn[i];
                if (s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {

                    if (stack.size() < 2 ) throw new IllegalArgumentException("Too few expressions for given operator");
                    else {
                        int x = stack.pop();
                        int y = stack.pop();
                        if (s.equals("+")) stack.push(x + y);
                        else if (s.equals("*")) stack.push(x *y);
                        else if (s.equals("-")) stack.push( y - x);
                        else if (s.equals("/")) stack.push( y / x);
                    }
                }
                else stack.push(Integer.parseInt(s));
            }
            return stack.pop();
        }
    }
}



