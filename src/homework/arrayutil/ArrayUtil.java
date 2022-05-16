package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        System.out.println(min);

        int evenNums;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");

            }
        }
        System.out.println();
        int unEven;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;


            }
        }
        System.out.print(countEven);

        System.out.println();
        int countUnEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countUnEven++;

            }
        }
        System.out.print(countUnEven);

        System.out.println();

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];

        }
        System.out.print(result / array.length);

        System.out.println();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        System.out.print(sum);
    }
}













