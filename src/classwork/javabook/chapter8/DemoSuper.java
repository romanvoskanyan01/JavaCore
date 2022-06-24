package classwork.javabook.chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight2 mybox1 = new BoxWeight2(10, 20, 15, 34.3);
        BoxWeight2 mybox2 = new BoxWeight2(2, 3, 4, 0.076);
        BoxWeight2 mybox3 = new BoxWeight2();
        BoxWeight2 mycube = new BoxWeight2(3, 2);
        BoxWeight2 myclone = new BoxWeight2(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Обьем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Обьем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Обьем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();
    }
}
