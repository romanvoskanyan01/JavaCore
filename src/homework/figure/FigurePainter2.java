package homework.figure;

public class FigurePainter2 {
    public static void main(String[] args) {
        // Figure 1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 + i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Figure 2
        for (int i = 0; i < 4; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");


            }
            System.out.println();

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <=4+i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
