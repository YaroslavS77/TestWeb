package OracleCourse;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(5);
        stack.push(8);
        stack.push(2);

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
