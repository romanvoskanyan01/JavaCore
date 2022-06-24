package classwork.javabook.chapter8;

public class B extends A {
    int k;



    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
    void callme(){
        System.out.println("В методе callme() из класса B ");
    }

}
