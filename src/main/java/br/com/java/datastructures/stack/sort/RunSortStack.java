package br.com.java.datastructures.stack.sort;

public class RunSortStack {

    public static void main(String[] args) {
        SortStack<Integer> stack = new SortStack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }

    private static SortStack sortStack(SortStack<Integer> stack) {
        SortStack<Integer> sortStack = new SortStack();

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!sortStack.isEmpty() && sortStack.peek() > temp) {
                stack.push(sortStack.pop());
            }
            sortStack.push(temp);
        }
        while (!sortStack.isEmpty()) {
            stack.push(sortStack.pop());
        }
        return stack;
    }
}
