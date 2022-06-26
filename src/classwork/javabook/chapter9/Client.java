package classwork.javabook.chapter9;

public class Client  implements Callback{
    public void callback(int p){
        System.out.println("Метод callback(), "  + "вызываемый со значением " + p);
    }

    void nonIfaceMeth(){
        System.out.println("B классах, реализующих интерфейсы," + "могут определяться и другие члены.");
    }
}
