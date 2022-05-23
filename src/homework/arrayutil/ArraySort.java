package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i];
            int val = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (min > numbers[j]) {
                    val = j;
                    min = numbers[j];
                }
            }
                int b = numbers[i];
                numbers[i] = numbers[val];
                numbers[val] = b;

            }

        for (int val : numbers)
            System.out.print(val + " ");

        System.out.println();

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i];
            int val = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (min < numbers[j]) {
                    val = j;
                    min = numbers[j];
                }
            }
            int b = numbers[i];
            numbers[i] = numbers[val];
            numbers[val] = b;

        }

        for (int val : numbers)
            System.out.print(val + " ");









    }
}
