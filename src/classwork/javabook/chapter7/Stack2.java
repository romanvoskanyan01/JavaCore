package classwork.javabook.chapter7;

public class Stack2 {
    private int stack[];
    private int tos;

    Stack2(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Stack is full.");
        } else stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else return stack[tos--];
    }
}
