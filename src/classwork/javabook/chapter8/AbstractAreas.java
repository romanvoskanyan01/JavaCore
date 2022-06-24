package classwork.javabook.chapter8;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(9, 5);
        Triangle2 t = new Triangle2(10, 8);
        Figure2 figref;
        figref = r;
        System.out.println("Плoщaдь равна " + figref.area());
        figref = t;
        System.out.println("Плoщaдь равна " + figref.area());
    }
}


