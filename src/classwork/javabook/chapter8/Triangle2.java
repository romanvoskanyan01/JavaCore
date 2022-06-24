package classwork.javabook.chapter8;

public class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("B области треугольника.");
        return dim1 * dim2 / 2;
    }
}
