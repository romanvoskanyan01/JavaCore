package classwork.javabook.chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;
        vol = mybox1.vol();
        System.out.println("Обьем равен " + vol);
        vol = mybox2.vol();
        System.out.println("Обьем равен " + vol);
    }
}
