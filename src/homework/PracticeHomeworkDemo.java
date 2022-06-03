package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework phd = new PracticeHomework();
        System.out.println(phd.convert(2));

        PracticeHomework phd1 = new PracticeHomework();
        System.out.println(phd1.calcAge(5));

        PracticeHomework phd2 = new PracticeHomework();
        System.out.println(phd2.nextNumber(10));

        PracticeHomework phd3 = new PracticeHomework();
        System.out.println(phd3.isSameNum(10, 5));

        PracticeHomework phd4 = new PracticeHomework();
        System.out.println(phd4.lessThanOrEqualToZero(0));

        PracticeHomework phd5 = new PracticeHomework();
        System.out.println(phd5.reverseBool(true));

        PracticeHomework phd6 = new PracticeHomework();
        int[] array1 = new int[7];
        int[] array2 = new int[12];
        System.out.println(phd6.maxLenghth(array1, array2));

    }
}
