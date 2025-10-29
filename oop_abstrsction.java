abstract class vechile{
    abstract void Break();
    abstract void accleration();

    void startEngine(){
        System.out.println("Engin is started");
    }
}

class car extends vechile{
    @Override
    void Break(){
        System.out.println("Car is moving slower");
    }
    @Override
    void accleration(){
        System.out.println("Car is moving fast now");
    }
}

public class oop_abstrsction {
    public static void main(String[] args) {
        car c1 = new car();
        c1.startEngine();
        c1.accleration();
        c1.Break();
    }
}
