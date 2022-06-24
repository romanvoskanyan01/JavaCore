package classwork.javabook.chapter8;

public abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2 (double a, double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
