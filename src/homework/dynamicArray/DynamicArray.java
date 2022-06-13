package homework.dynamicArray;

public class DynamicArray {
    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }

    private void increaseArray() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    boolean isEmpty() {
        boolean b = false;
        if (size == 0) {
            b = true;
        }
        return b;
    }

    int getByIndex(int index) {
        return array[index];
    }

    int getFirstIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    void set(int index, int value) {
        array[index] = value;
        System.out.println(value);
    }

    void add(int index, int value) {
        if (index >= 0 && index < size)
            for (int i = size; i >= index; i--) {
                array[i + 1] = array[i];
            }
        size++;
        array[index] = value;
    }

    void delete(int index) {
        if (index >= 0 || index < size)
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
        size--;
    }
}









