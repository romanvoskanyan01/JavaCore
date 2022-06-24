package classwork.javabook.chapter8;

public class B2 extends A2 {
    int i;

    B2(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
    B2(){
        System.out.println("В конструкторе B2. ");
    }
}
