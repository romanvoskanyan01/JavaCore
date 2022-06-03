package classwork.javabook.chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        vol = mybox1.vol();
        System.out.println("Обьем равен " + vol);
        vol = mybox2.vol();
        System.out.println("Обьем равен " + vol);
    }
}
