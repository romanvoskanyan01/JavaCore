package classwork.javabook.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);
        vol = mybox1.vol();
        System.out.println("Обьем равен " + vol);
        vol = mybox2.vol();
        System.out.println("Обьем равен " + vol);
    }
}
