package classwork.javabook.chapter9.p2;

public class OtherPackage {
    OtherPackage(){
        classwork.javabook.chapter9.p1.Protection p = new classwork.javabook.chapter9.p1.Protection();
        System.out.println("конструктор из другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }
}
