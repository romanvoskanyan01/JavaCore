package classwork.javabook.chapter8;

public class Rectangle2 extends Figure2 {
    Rectangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("B области четырехугольника.");
        return dim1 * dim2;
    }
}
