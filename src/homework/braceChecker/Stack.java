package homework.braceChecker;

public class Stack {
    private int[] stack = new int[20];
    private int index;

    public Stack() {
        index = -1;
    }

    public void push(int item) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            stack[++index] = item;
        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else
            return stack[index--];

    }
}
