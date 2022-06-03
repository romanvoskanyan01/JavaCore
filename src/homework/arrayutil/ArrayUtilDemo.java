package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        ArrayUtil au = new ArrayUtil();
        au.nums(numbers);

        System.out.println();

        int[] max = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        ArrayUtil au1 = new ArrayUtil();
        System.out.println("max " + au1.max(max));


        int[] min = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        ArrayUtil au2 = new ArrayUtil();
        System.out.println("min " + au2.min(min));

        int[] evenNums = {1, 6, 5, 11, 25, 16, 20, 30, 33};
        ArrayUtil au3 = new ArrayUtil();
        au3.evenNums(evenNums);

        System.out.println();


        int[] odds = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        ArrayUtil au4 = new ArrayUtil();
        au4.odds(odds);

        System.out.println();

        int[] countOfEvens = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        int vol;
        ArrayUtil au5 = new ArrayUtil();
        vol = au5.countOfEvens(countOfEvens);
        System.out.println("զույգերի քանակը " + vol);


        int[] countOfOdds = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        int volume;
        ArrayUtil au6 = new ArrayUtil();
        volume = au6.countOfOdds(countOfOdds);
        System.out.println("կենտերի քանակը " + volume);

        int[] result = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        ArrayUtil au7 = new ArrayUtil();
        au7.result(result);

        int[] sum = {1, 4, 6, 5, 11, 25, 16, 20, 30, 33};
        ArrayUtil au8 = new ArrayUtil();
        au8.sum(sum);

    }
}
