package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] result = {};
        char space = ' ';
        int first = 0;
        int endindex = 0;
        for (int i = 0; i <= spaceArray.length - 1; i++) {
            if (spaceArray[i] != space) {
                first = i;
                break;
            }
        }
        for (int j = spaceArray.length - 1; j >= 0; j--) {
            if (spaceArray[j] != space) {
                endindex = j;
                break;
            }
        }
        for (int i = first; i <= endindex; i++) {
            System.out.print(spaceArray[i]);
        }

    }
}


