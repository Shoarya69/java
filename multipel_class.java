interface S{
    void show();
}
interface b{
    void foc();
} 

class D implements S,b{
    public void show(){
        System.out.println("This is show");
    }
    public void foc(){
        System.out.println("This is FoC");
    }
}

public class multipel_class {
    public static void main(String[] args) {
        D f = new D();
        f.show();
        f.foc();
    }
}
