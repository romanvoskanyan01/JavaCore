package homework.arrayutil;

public class ArrayUtil {
    void nums(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.print("մասիվի էլեմենտները ");
    }
    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            {
            }
        }
        return max;
    }
    int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    void evenNums(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                System.out.print(array[i] + " ");

            }
        }
        System.out.print("զույգերը ");

    }

    void odds(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                System.out.print(array[i] + " ");
            }
        }
        System.out.print("կենտերը ");

    }

    int countOfEvens(int[] array) {
        int countOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        return countOfEvens++;
    }

    int countOfOdds(int[] array) {
        int countOfOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOdds++;
            }
        }
        return countOfOdds;
    }

    double result(int[] array) {

        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];

        }
        System.out.println("միջին թվաբանականը = " + result / array.length);
        return result;
    }

    double sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        System.out.print("գումարը = " + sum);
        return sum;
    }
}















