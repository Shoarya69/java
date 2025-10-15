
public class p {
    public static void swap(int a,int b) {
        element e = new element();
        e.e1 = a;
        e.e2 = b;
        int temp = e.e1;
        e.e1=e.e2;
        e.e2 = e.e1;
    }
    public static void main(String[] args) {
        int a=3,b=2;
        swap(a,b);
        System.out.println(a+" "+b);
    }
}

class element{
    public int e1;
    public int e2;
}