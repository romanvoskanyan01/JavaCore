package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(7);
        array.add(1);
        array.add(5);
        array.add(12);
        array.add(25);
        array.add(16);
        System.out.println(array.isEmpty());
        System.out.println(array.getByIndex(4));
        System.out.println(array.getFirstIndexByValue(25));
        array.set(4, 5);
        array.add(0, 3);
        array.print();
        System.out.println();
        array.delete(3);
        array.print();


    }
}