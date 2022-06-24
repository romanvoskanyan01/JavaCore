package classwork.javabook.chapter8;

public class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }

}
