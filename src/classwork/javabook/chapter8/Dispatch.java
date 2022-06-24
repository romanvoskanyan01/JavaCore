package classwork.javabook.chapter8;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C2 c2 = new C2();

        A r;
        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c2;
        r.callme();
    }
}
