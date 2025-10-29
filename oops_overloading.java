class animal{
    void eat(){
        System.out.println("Animeal is eating");
    }
}
class cat extends animal{
    @Override
    void eat(){
        System.out.println("Cat is eating");
    }
}
public class oops_overloading {
    public static void main(String[] args) {
        cat a1 = new cat();
        a1.eat();
    }
}
