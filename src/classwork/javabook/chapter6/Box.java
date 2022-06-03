package classwork.javabook.chapter6;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Обьем равен ");
        System.out.println(width * height * depth);
    }

    double vol() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        System.out.println("Конструирование обьекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}



