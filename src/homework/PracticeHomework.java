package homework;

public class PracticeHomework {
    int convert(int minutes) {
        int seconds = minutes * 60;

        return seconds;
    }

    int calcAge(int years) {
        int days = years * 365;
        return days;
    }

    int nextNumber(int number) {
        int nums = number - 1;
        return nums;
    }

    boolean isSameNum(int a, int b) {
        boolean vol = false;
        if (a == b) {
            vol = true;
        }
        return vol;
    }

    boolean lessThanOrEqualToZero(int number) {
        boolean volume = false;
        if (number <= 0) {
            volume = true;
        }
        return volume;
    }

    boolean reverseBool(boolean value) {
        boolean vol;
        if (value == true) {
            vol = false;
        } else vol = true;
        return vol;
    }

    int maxLenghth(int[] array1, int[] array2) {
        int x = array1.length;
        int y = array2.length;
        if (x > y) {
            return x;
        }
        return y;
    }
}



