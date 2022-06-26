package classwork.javabook.chapter9;

public class FixedStack implements IntStack {
    private int stack[];
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Стек заполнен.");
        } else {
            stack[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}

