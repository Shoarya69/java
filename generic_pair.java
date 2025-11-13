import java.util.*;

public class generic_pair {
    public static void main(String[] args) {
        pore<Integer, String> p = new pore<>(1,"this is the end");
        p.printer();    
        
    }
}
class pore<T, M>{
    T a = null;
    M b = null;
    public pore(T a,M b){
        this.a = a;
        this.b = b;
    }
    public void printer(){
        System.out.println("Your first value :- "+this.a);
        System.out.println("your another value :- "+this.b);
    }
}