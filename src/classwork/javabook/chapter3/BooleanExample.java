package classwork.javabook.chapter3;

public class BooleanExample {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b равно" + b);
        b = true;
        System.out.println("b равно" + b);
        if (b) {
            System.out.println("Этот код  выполняется.");
            b = false;
            if (b) System.out.println("Этот код не выполняется.");
            System.out.println("10>9равно" + (10 > 9));
        }
    }
}
