package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];{
            }
        }
        System.out.println("max " + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min " + min);
        System.out.println("զույգերը։");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");

            }
        }
        System.out.println();
        System.out.println("կենտերը։");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        int countOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        System.out.print( "զույգերի քանակը = " + countOfEvens);

        System.out.println();
        int countOfOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOdds++;
            }
        }
        System.out.print("կենտերի քանակը = " + countOfOdds);

        System.out.println();

        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];

        }
        System.out.print( "միջին թվաբանականը = " + result / array.length);

        System.out.println();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        System.out.print( "գումարը = " +sum);
    }
}













