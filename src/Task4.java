import java.util.Scanner;
import java.util.Stack;

public class Task4 {
    private static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, item);
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        if (in.hasNextLine()) {
            String[] elements = in.nextLine().split("\\s+");
            for (String el : elements) {
                if (!el.isEmpty()) stack.push(Integer.parseInt(el));
            }
        }

        reverseStack(stack);

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + (i == stack.size() - 1 ? "" : " "));
        }
        in.close();
    }
}