package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char space = ' ';
        int first = 0;
        int endIndex = 0;
        for (int i = 0; i <= spaceArray.length - 1; i++) {
            if (spaceArray[i] != space) {
                first = i;
                break;
            }
        }
        for (int j = spaceArray.length - 1; j >= 0; j--) {
            if (spaceArray[j] != space) {
                endIndex = j;
                break;
            }
        }
        int newLength = (endIndex - first) + 1;
        char[] result = new char[newLength];
        int j = 0;
        for (int i = first; i<=endIndex; i++) {
        result[j++] = spaceArray[j];}
        for (char c : result) {
            System.out.print(c);
        }

    }
}


