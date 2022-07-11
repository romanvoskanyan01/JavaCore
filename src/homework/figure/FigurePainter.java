package homework.figure;

public class FigurePainter {

    // Figure 1
        public static void main(String[] args) {
            // Figure 1
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            // Figure 2

            for (int i = 0; i < 5; i++) {
                for (int j = i; j < 4; j++) {
                    System.out.print("  ");

                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
            System.out.println();
            //Figure 3

            for (int i = 0; i < 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print("* ");

                }
                System.out.println();
            }
        }
    }

