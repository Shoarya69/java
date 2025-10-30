interface fun{
    public void add(int a,int b);
}

public class lamda_add {
    public static void main(String[] args){
        int a=5,b=6;
        fun f = (c,d) -> System.out.println(a+""+b);
        f.add(a, b);
    }
}
