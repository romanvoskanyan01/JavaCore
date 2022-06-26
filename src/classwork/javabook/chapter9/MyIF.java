package classwork.javabook.chapter9;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Обьект типа String по умолчанию";
    }
    static int getDefaultNumber(){
        return 0;
    }
}
