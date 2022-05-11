package homework;


public class FigurePainter2 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= num; j++) {
                System.out.print(" ");

            }
            num--;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}










